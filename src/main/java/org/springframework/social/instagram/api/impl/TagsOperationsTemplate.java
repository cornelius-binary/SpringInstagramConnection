/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.social.instagram.api.impl;

import org.springframework.social.instagram.api.TagsOperations;
import org.springframework.social.instagram.api.impl.response.MediaCollectionResponse;
import org.springframework.social.instagram.api.impl.response.TagResponse;
import org.springframework.social.instagram.api.impl.response.TagResponseCollection;
import java.util.Collection;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

/**
 * Implements {@link TagsOperations} functionality
 *
 * @author Cornelius M
 */
public class TagsOperationsTemplate extends OperationsTemplate implements TagsOperations {

    public TagsOperationsTemplate(InstagramTemplate instagram) {
        super(instagram);
    }

    public Tag getTag(String tagName) {
        return get(buildAuthorizedUri(TAG_ENDPOINT + tagName), TagResponse.class).getData();
    }

    public Collection<Media> getRecentTags(String tagName, Long count, String minTagId, String maxTagId) {
        MultiValueMap<String, String> requestMap = new LinkedMultiValueMap();
        requestMap.add("count", String.valueOf(count));
        requestMap.add("min_tag_id", minTagId);
        requestMap.add("max_tag_id", maxTagId);
        return get(buildUri(TAG_ENDPOINT + tagName + "/media/recent", requestMap, true), MediaCollectionResponse.class).getData();
    }

    public Collection<Tag> searchTag(String query) {
        MultiValueMap<String, String> requestMap = new LinkedMultiValueMap();
        requestMap.add("q", query);
        return get(buildUri(TAG_ENDPOINT + "/search", requestMap, true), TagResponseCollection.class).getData();
    }

}
