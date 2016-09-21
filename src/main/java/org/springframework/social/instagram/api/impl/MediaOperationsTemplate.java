/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.social.instagram.api.impl;

import org.springframework.social.instagram.api.MediaOperations;
import org.springframework.social.instagram.api.impl.response.CommentCollectionResponse;
import org.springframework.social.instagram.api.impl.response.GeneralResponse;
import org.springframework.social.instagram.api.impl.response.MediaCollectionResponse;
import org.springframework.social.instagram.api.impl.response.MediaResponse;
import org.springframework.social.instagram.api.impl.response.UserProfileResponseCollection;
import java.util.Collection;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

/**
 * Used to implement MediaOperations
 *
 * @author Cornelius M
 */
public class MediaOperationsTemplate extends OperationsTemplate implements MediaOperations {

    public MediaOperationsTemplate(InstagramTemplate instagram) {
        super(instagram);
    }

    public Media getMedia(String id) {
        return get(buildAuthorizedUri(MEDIA_ENDPOINT + id), MediaResponse.class).getData();
    }

    public Media findByShortcode(String shortcode) {
        return get(buildAuthorizedUri(MEDIA_ENDPOINT + "shortcode/" + shortcode), MediaResponse.class).getData();
    }

    public Collection<Media> searchArea(String latitude, String longitude, String distance) {
        MultiValueMap<String, String> requestMap = new LinkedMultiValueMap();
        requestMap.add("distance", distance);
        requestMap.add("lat", latitude);
        requestMap.add("lng", longitude);
        return get(buildUri(MEDIA_ENDPOINT + "search/", requestMap, true), MediaCollectionResponse.class).getData();
    }

    public Collection<Comment> getComment(String mediaId) {
        return get(buildAuthorizedUri(MEDIA_ENDPOINT + mediaId + "/comments"), CommentCollectionResponse.class).getData();
    }

    public boolean createComment(String mediaId, String comment) {
        MultiValueMap<String, Object> params = new LinkedMultiValueMap();
        params.add("text", comment);
        GeneralResponse response = post(buildAuthorizedUri(MEDIA_ENDPOINT + mediaId + "/comments"), params, GeneralResponse.class);
        return (response.getMeta().getCode() == 200);
    }

    public void deleteComment(String mediaId, String commentId) {
        delete(buildAuthorizedUri(MEDIA_ENDPOINT + mediaId + "/comments/" + commentId));

    }

    public Collection<UserProfileTemplate> getLikes(String mediaId) {
        return get(buildAuthorizedUri(MEDIA_ENDPOINT + mediaId + "/likes"), UserProfileResponseCollection.class).getData();
    }

    public boolean like(String mediaId) {
        GeneralResponse response = post(buildAuthorizedUri(MEDIA_ENDPOINT + mediaId + "/likes"), null, GeneralResponse.class);
        return (response.getMeta().getCode() == 200);
    }

    public void unLike(String mediaId) {
        delete(buildAuthorizedUri(MEDIA_ENDPOINT + mediaId + "/likes/"));
    }

}
