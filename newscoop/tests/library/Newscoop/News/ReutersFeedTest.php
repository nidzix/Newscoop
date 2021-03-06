<?php
/**
 * @package Newscoop
 * @copyright 2011 Sourcefabric o.p.s.
 * @license http://www.gnu.org/licenses/gpl-3.0.txt
 */

namespace Newscoop\News;

/**
 */
class ReutersFeedTest extends \TestCase
{
    /** @var Zend_Rest_Client */
    protected $client;

    /** @var Newscoop\News\ReutersFeed */
    protected $feed;

    /** @var Doctrine\Common\Persistance\Objectmanager */
    protected $odm;

    public function setUp()
    {
        global $application;

        if ($application->getOption('reuters') === null) {
            $this->markTestSkipped('API settings not available.');
        }

        $this->odm = $this->setUpOdm();

        $this->feed = new ReutersFeed($application->getOption('reuters'));
    }

    public function tearDown()
    {
        $this->tearDownOdm($this->odm);
    }

    public function testConstructor()
    {
        $this->assertInstanceOf('Newscoop\News\ReutersFeed', $this->feed);
    }

    public function testGetName()
    {
        global $application;

        $options = $application->getOptions();
        $this->assertContains('Reuters', $this->feed->getName());
        $this->assertContains($options['reuters']['username'], $this->feed->getName());
    }

    public function testGetChannels()
    {
        $channels = $this->feed->getChannels();
        $this->assertNotEmpty($channels);

        $this->assertObjectHasAttribute('alias', $channels[0]);
        $this->assertObjectHasAttribute('description', $channels[0]);
        $this->assertObjectHasAttribute('lastUpdate', $channels[0]);
        $this->assertObjectHasAttribute('category', $channels[0]);
        $this->assertInstanceOf('DateTime', $channels[0]->lastUpdate);

        return $channels;
    }

    public function testUpdate()
    {
        $settingsService = new SettingsService($this->odm);
        $itemService = new ItemService($this->odm, $settingsService);

        $this->odm->persist($this->feed);
        $this->odm->flush();

        $this->assertNotNull($this->feed->getId());
        $this->assertNull($this->feed->getUpdated());

        $this->feed->update($this->odm, $itemService);
        $this->assertInstanceOf('DateTime', $this->feed->getUpdated());

        $items = $itemService->findBy(array());
        $this->assertGreaterThan(0, count($items));

        // test with relative date
        $this->feed->update($this->odm, $itemService);
    }

    public function testUpdateAfter7Days()
    {
        $settingsService = new SettingsService($this->odm);
        $itemService = new ItemService($this->odm, $settingsService);

        $updated = new \ReflectionProperty($this->feed, 'updated');
        $updated->setAccessible(true);
        $updated->setValue($this->feed, new \DateTime('-8 day'));
        $this->odm->persist($this->feed);
        $this->odm->flush();

        $this->feed->update($this->odm, $itemService);
    }

    public function testGetRemoteContentSrc()
    {
        $remoteContent = $this->getMockBuilder('Newscoop\News\RemoteContent')
            ->disableOriginalConstructor()
            ->getMock();

        $remoteContent->expects($this->once())
            ->method('getHref')
            ->will($this->returnValue('href'));

        $this->assertContains("href?token=", $this->feed->getRemoteContentSrc($remoteContent));
    }
}
