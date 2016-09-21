/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.springframework.social.instagram.api;

import org.springframework.social.instagram.api.impl.Media;
import org.springframework.social.instagram.api.impl.Tag;
import java.util.Collection;

/**
 *
 * @author Cornelius M.
 */
public interface TagsOperations {
    public final String TAG_ENDPOINT = "tags/";
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
    * @return a Collection of recent tagged media
    */
   public Collection<Media> getRecentTags(String tagName, Long count, String minTagId, String maxTagId);
   /**
    * Search for tags by name
    * @param query A valid tag name without a leading #. (eg. snowy, nofilter)
    * @return a Collection of recent tags
    */
   public Collection<Tag> searchTag(String query);
}
