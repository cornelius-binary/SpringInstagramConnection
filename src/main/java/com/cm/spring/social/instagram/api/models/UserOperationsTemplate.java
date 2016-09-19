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
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Cornelius M
 */
public class UserOperationsTemplate extends OperationsTemplate implements UserOperations {

    //final private String access_token;
    private final Instagram instagram;
    @Autowired
    private MultiValueMap<String, String> valueMap;
    private final RestTemplate restTemplate;

    public UserOperationsTemplate(InstagramTemplate instagram) {
        super(instagram);
        this.instagram = instagram;
        this.restTemplate = instagram.getRestTemplate();
    }

    @Override
    public UserProfileTemplate getUser() {
        return get(buildAuthorizedUri(USER_ENDPOINT + "self/"), UserProfileResponse.class).getData();
    }

    @Override
    public UserProfileTemplate getUser(String userId) {
        return get(buildAuthorizedUri(USER_ENDPOINT + userId), UserProfileResponse.class).getData();

    }

    @Override
    public Collection<Media> getRecentMedia(int count, String min_id, String max_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Media> getRecentMedia(String userId, int count, String min_id, String max_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Media> getLikedMedia(int count, String max_liked_id) {
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
    public Relationship getRelationship(String userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Relationship updateRelationship(String userId, String action) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
