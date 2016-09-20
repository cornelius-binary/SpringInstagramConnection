/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cm.spring.social.instagram.api;

import com.cm.spring.social.instagram.api.models.Comment;
import com.cm.spring.social.instagram.api.models.Media;
import com.cm.spring.social.instagram.api.models.UserProfileTemplate;
import java.util.Collection;

/**
 *
 * @author Cornelius M.
 */
public interface MediaOperations {
    /**
     * fetch media object using media id
     * @param id media id
     * @return Media Object
     */
    public Media getMedia(Long id);
    /**
     * Used to get media using their shortcode.  shortcode can be found in its shortlink URL
     * @param shortcode String containing the shortcode
     * @return MediaObject
     */
    public Media getMedia(String shortcode);
    /**
     * Search for recent media in a given area. 
     * @param latitude Latitude of the center search coordinate. If used, longitude is required
     * @param longitude Longitude of the center search coordinate. If used, latitude is required.
     * @param distance Default is 1km (distance=1000), max distance is 5km 
     * @return a Collection of Media objects
     */
    public Collection<Media> searchArea(float latitude, float longitude, float distance);
    /**
     * Get a list of recent media objects from a given location.
     * @param location_id Location id
     * @param minId Return media before this min_id 
     * @param maxId Return media after this max_id.
     * @return a Collection of Media objects
     */
    public Collection<Media> findByLocation(Long location_id, Long minId, Long maxId);
     /**
     * Get a list of recent comments on a media object
     * @param mediaId targeted media id
     * @return Comment object
     */
    public Comment getComment(Long mediaId);
    /**
     * Create a comment on a media object
     * @param mediaId targeted media id
     * @return  true on success and false otherwise
     */
    public boolean createComment(Long mediaId);
    /**
     * used to delete a comment created by the user on their media objects
     * @param mediaId targeted media id
     * @return true on success and false otherwise
     */
    public boolean deleteComment(Long mediaId);
    /**
     * used to delete a comment created by the user on other users media objects
     * @param mediaId targeted media id
     * @return true on success and false otherwise
     */
    public boolean deleteSecondaryComment(Long mediaId);
    /**
     * Get a list of users who have liked this media.
     * @param mediaId targeted media id
     * @return a collection of UserProfileTemplate
     */
    public Collection<UserProfileTemplate> getLikes(Long mediaId);
    /**
     * Set a like on this media by the currently authenticated user
     * @param mediaId targeted media id
     * @return true on success and false otherwise 
     */
    public boolean like(Long mediaId);
    /**
     * Remove a like on this media by the currently authenticated user
     * @param mediaId targeted media id
     * @return true on success and false otherwise 
     */
    public boolean unLike(Long mediaId);
}
