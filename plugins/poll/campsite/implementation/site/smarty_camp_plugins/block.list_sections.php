<?php
/**
 * Campsite customized Smarty plugin
 * @package Campsite
 */


/**
 * Campsite list_sections block plugin
 *
 * Type:     block
 * Name:     list_sections
 * Purpose:  Provides a...
 *
 * @param string
 *     $p_params
 * @param string
 *     $p_smarty
 * @param string
 *     $p_content
 *
 * @return
 *
 */
function smarty_block_list_sections($p_params, $p_content, &$p_smarty, &$p_repeat)
{
    require_once $p_smarty->_get_plugin_filepath('shared','escape_special_chars');

    // gets the context variable
    $campContext = $p_smarty->get_template_vars('campsite');
    $html = '';

    if (!isset($p_content)) {
        $start = $campContext->next_list_start('SectionsList');
    	$sectionsList = new SectionsList($start, $p_params);
    	$campContext->setCurrentList($sectionsList, array('publication', 'language',
    	                                                  'issue', 'section', 'article',
    	                                                  'image', 'attachment', 'comment',
    	                                                  'audioclip', 'subtitle'));
    }

    $currentSection = $campContext->current_sections_list->defaultIterator()->current();
    if (is_null($currentSection)) {
	    $p_repeat = false;
	    $campContext->resetCurrentList();
    	return $html;
    } else {
        $campContext->section = $currentSection;
    	$p_repeat = true;
    }

    if (isset($p_content)) {
		$html = $p_content;
	    if ($p_repeat) {
    		$campContext->current_sections_list->defaultIterator()->next();
            if (!is_null($campContext->current_sections_list->current)) {
                $campContext->section = $campContext->current_sections_list->current;
            }
    	}
    }

    return $html;
}

?>