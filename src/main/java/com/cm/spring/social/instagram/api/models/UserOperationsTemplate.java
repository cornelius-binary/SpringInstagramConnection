/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cm.spring.social.instagram.api.models;

import com.cm.spring.social.instagram.api.models.response.MediaCollectionResponse;
import com.cm.spring.social.instagram.api.models.response.UserProfileResponse;
import com.cm.spring.social.instagram.api.Instagram;
import com.cm.spring.social.instagram.api.UserOperations;
import com.cm.spring.social.instagram.api.models.response.RelationshipResponse;
import com.cm.spring.social.instagram.api.models.response.UserProfileResponseCollection;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
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
    public Collection<Media> getRecentMedia(int count, String minId, String maxId) {
        MultiValueMap<String, String> requestMap = new LinkedMultiValueMap();
        requestMap.add("count", String.valueOf(count));
        requestMap.add("min_id", minId);
        requestMap.add("max_id", maxId);
        return get(buildUri(USER_ENDPOINT + "self/media/recent/", requestMap, true), MediaCollectionResponse.class).getData();
    }

    @Override
    public Collection<Media> getRecentMedia(String userId, int count, String minId, String maxId) {
        MultiValueMap<String, String> requestMap = new LinkedMultiValueMap();
        requestMap.add("count", String.valueOf(count));
        requestMap.add("min_id", minId);
        requestMap.add("max_id", maxId);
//        if (isPublic) {
//            requestMap.add("scope", "public_content");
//        }
        return get(buildUri(USER_ENDPOINT + userId + "/media/recent/", requestMap, true), MediaCollectionResponse.class).getData();
    }

    @Override
    public Collection<Media> getLikedMedia(int count, String maxLikedId) {
        MultiValueMap<String, String> requestMap = new LinkedMultiValueMap();
        requestMap.add("count", String.valueOf(count));
        requestMap.add("max_liked_id", maxLikedId);
        return get(buildUri(USER_ENDPOINT + "self/media/liked/", requestMap, true), MediaCollectionResponse.class).getData();
    }

    @Override
    public Collection<UserProfileTemplate> searchUsers(int count, String queryString) {
        MultiValueMap<String, String> requestMap = new LinkedMultiValueMap();
        requestMap.add("count", String.valueOf(count));
        requestMap.add("q", queryString);
        return get(buildUri(USER_ENDPOINT + "search/", requestMap, true), UserProfileResponseCollection.class).getData();
    }

    @Override
    public Collection<UserProfileTemplate> findFollowing() {
        return get(buildAuthorizedUri(USER_ENDPOINT + "self/follows"), UserProfileResponseCollection.class).getData();
     }

    @Override
    public Collection<UserProfileTemplate> getFollowers() {
        return get(buildAuthorizedUri(USER_ENDPOINT + "self/followed-by"), UserProfileResponseCollection.class).getData();
    }

    @Override
    public Collection<UserProfileTemplate> getRequests() {
        return get(buildAuthorizedUri(USER_ENDPOINT + "self/requested-by"), UserProfileResponseCollection.class).getData();
    }

    @Override
    public Relationship getRelationship(String userId) {
        return get(buildAuthorizedUri(USER_ENDPOINT + userId + "/relationship"), RelationshipResponse.class).getData();
    }

    @Override
    public Relationship updateRelationship(String userId, String action) {
        MultiValueMap<String, Object> params = new LinkedMultiValueMap();
        params.add("action", action);
        
        return post(buildAuthorizedUri(USER_ENDPOINT + userId + "/relationship"), params, RelationshipResponse.class).getData();
    }

}
