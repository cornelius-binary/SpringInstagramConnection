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

    public final String MEDIA_ENDPOINT = "media/";

    /**
     * fetch media object using media id
     *
     * @param id media id
     * @return Media Object
     */
    public Media getMedia(String id);

    /**
     * Used to get media using their shortcode. shortcode can be found in its
     * shortlink URL
     *
     * @param shortcode String containing the shortcode
     * @return MediaObject
     */
    public Media findByShortcode(String shortcode);

    /**
     * Search for recent media in a given area.
     *
     * @param latitude Latitude of the center search coordinate. If used,
     * longitude is required
     * @param longitude Longitude of the center search coordinate. If used,
     * latitude is required.
     * @param distance Default is 1km (distance=1000), max distance is 5km
     * @return a Collection of Media objects
     */
    public Collection<Media> searchArea(String latitude, String longitude, String distance);    

    /**
     * Get a list of recent comments on a media object
     *
     * @param mediaId targeted media id
     * @return Comment object
     */
    public Collection<Comment> getComment(String mediaId);

    /**     * 
     * Create a comment on a media object with the following rules:
     * <ul>
     * <li>The total length of the comment cannot exceed 300 characters.</li>
     * <li>The comment cannot contain more than 4 hashtags.</li>
     * <li>The comment cannot contain more than 1 URL.</li>
     * <li>The comment cannot consist of all capital letters.</li>
     * </ul>
     * 
     * @param mediaId targeted media id
     * @param comment     
     * @return true on success and false otherwise
     */
    public boolean createComment(String mediaId, String comment);

    /**
     * used to delete a comment created by the user on their media objects
     *
     * @param mediaId targeted media id
     * @param commentId targeted comment id
     */
    public void deleteComment(String mediaId, String commentId);   

    /**
     * Get a list of users who have liked this media.
     *
     * @param mediaId targeted media id
     * @return a collection of UserProfileTemplate
     */
    public Collection<UserProfileTemplate> getLikes(String mediaId);

    /**
     * Set a like on this media by the currently authenticated user.
     * The public_content scope is required for media that does not belong to the owner of the access_token
     *
     * @param mediaId targeted media id
     * @return true on success and false otherwise
     */
    public boolean like(String mediaId);

    /**
     * Remove a like on this media by the currently authenticated user.
     * The public_content scope is required for media that does not belong to the owner of the access_token. 
     *
     * @param mediaId targeted media id
     */
    public void unLike(String mediaId);
}
