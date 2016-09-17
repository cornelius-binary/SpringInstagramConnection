/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cm.spring.social.instagram.api;

import com.cm.spring.social.instagram.api.models.Tag;
import java.util.Collection;

/**
 *
 * @author Cornelius M.
 */
public interface TagsOperations {
    /**
     * Get information about a tag object. 
     * @param tagName
     * @return 
     */
   public Tag getTag(String tagName);
   /**
    * Get a list of recently tagged media.
    * @param tagName
    * @param count Count of tagged media to return.
    * @param minTagId Return media before this min_tag_id. 
    * @param maxTagId Return media after this max_tag_id
    * @return a Collection of recent tags
    */
   public Collection<Tag> getRecentTags(String tagName, Long count, Long minTagId, Long maxTagId);
   /**
    * Search for tags by name
    * @param query A valid tag name without a leading #. (eg. snowy, nofilter)
    * @return a Collection of recent tags
    */
   public Collection<Tag> searchTag(String query);
}