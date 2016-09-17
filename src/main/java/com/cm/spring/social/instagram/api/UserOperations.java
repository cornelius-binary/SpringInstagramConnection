/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cm.spring.social.instagram.api;

import com.cm.spring.social.instagram.api.models.Relationship;
import com.cm.spring.social.instagram.api.models.UserProfileTemplate;
import java.util.Collection;

/**
 *
 * @author Cornelius M.
 */
public interface UserOperations {
    
    public static String USER_ENDPOINT = "users/";
    /**
     * Get user profile using the access token
     * @return returns user profile inform of UserProfileTemplate object
     */
    public UserProfileTemplate getUser();
    /**
     * Get user profile using their id
     * @param userId the user id of the intended user
     * @return returns user profile inform of UserProfileTemplate object
     */
    public UserProfileTemplate getUser(Long userId);
    
    /**
     * Used to return recent user media. 
     * If both min_id and max_id are set to null, only first elements specified by the count will be returned
     * @param count number of items to return
     * @param min_id return items later than this id
     * @param max_id return items earlier than this id
     * @return returns a collection Media object
     */
    public Collection<Media> getRecentMedia(int count, Long min_id, Long max_id);
    /**
     * Used to return recent user media using userId
     * If both min_id and max_id are set to null, only first elements specified by the count will be returned
     * @param count number of items to return
     * @param min_id return items later than this id
     * @param max_id return items earlier than this id
     * @param userId the user id of the intended user
     * @return returns a collection Media object
     */
    public Collection<Media> getRecentMedia(Long userId, int count, Long min_id, Long max_id);
    /**
     * Used to get liked media of the current user
     * @param count number of items to return
     * @param max_liked_id return items earlier than this id
     * @return a collection of Media items
     */
    public Collection<Media> getLikedMedia(int count, Long max_liked_id);
    /**
     * used to search a user using the specified query parameter
     * @param count number of results to return
     * @param queryString query parameter
     * @return a collection of UserProfileTemplate
     */
    public Collection<UserProfileTemplate> searchUsers(int count, String queryString);    
    /**
     * Used to get a list of users who the current user follows
     * @return a collection of UserProfileTemplate that the current user follows
     */
    public Collection<UserProfileTemplate> findFollowing();
    /**
     * get a collection of users following the current user
     * @return UserProfileTemplate Collection
     */
    public Collection<UserProfileTemplate> getFollowers();
    /**
     * Used to get users requested to follow the current user
     * @return UserProfileTemplate Collection
     */
    public Collection<UserProfileTemplate> getRequests();
    /**
     * Get the relationship between the current user and the indicated user
     * @param userId user id of the targeted user
     * @return Relationship object
     */
    public Relationship getRelationship(Long userId);
    /**
     * used to update the relationship of the current user to the indicated user
     * @param userId user id of the targeted user
     * @param action relationship action e.g. follow | unfollow | approve | ignore
     * @return Relationship object
     */
    public Relationship updateRelationship(Long userId, String action);
    
    
}
