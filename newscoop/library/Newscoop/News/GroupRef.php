<?php
/**
 * @package Newscoop
 * @copyright 2011 Sourcefabric o.p.s.
 * @license http://www.gnu.org/licenses/gpl-3.0.txt
 */

namespace Newscoop\News;

use Doctrine\ODM\MongoDB\Mapping\Annotations as ODM;

/**
 * GroupRef
 * @ODM\EmbeddedDocument()
 */
class GroupRef
{
    /**
     * @ODM\Id
     * @var string
     */
    protected $id;

    /**
     * @ODM\String
     * @var string
     */
    protected $idRef;

    /**
     * @param string $idRef
     */
    public function __construct($idRef)
    {
        $this->idRef = (string) $idRef;
    }

    /**
     * Get idref
     *
     * @return string
     */
    public function getIdRef()
    {
        return $this->idRef;
    }
}
