/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cm.spring.social.instagram.api.models;

import com.cm.spring.social.instagram.api.Instagram;
import com.cm.spring.social.instagram.api.UserOperations;
import com.cm.spring.social.instagram.api.Media;
import java.util.Collection;

/**
 *
 * @author Cornelius M
 */
public class UserOperationsTemplate extends OperationsTemplate implements UserOperations {
    
    //final private String access_token;
    private final Instagram instagram;
    
    public UserOperationsTemplate(InstagramTemplate instagram){
        super(instagram);
        this.instagram = instagram;
    }
    @Override
    public UserProfileTemplate getUser() {
        return get(buildUri(USER_ENDPOINT+"/self/?access_token="+instagram.getAccessToken()), UserProfileResponse.class).getData();
    }

    @Override
    public UserProfileTemplate getUser(Long userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Media> getRecentMedia(int count, Long min_id, Long max_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Media> getRecentMedia(Long userId, int count, Long min_id, Long max_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Media> getLikedMedia(int count, Long max_liked_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<UserProfileTemplate> searchUsers(int count, String queryString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<UserProfileTemplate> findFollowing() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<UserProfileTemplate> getFollowers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<UserProfileTemplate> getRequests() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Relationship getRelationship(Long userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Relationship updateRelationship(Long userId, String action) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
