/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.social.instagram.api.impl;

import org.springframework.social.instagram.api.Instagram;
import org.springframework.social.instagram.api.LocationOperations;
import org.springframework.social.instagram.api.MediaOperations;
import org.springframework.social.instagram.api.TagsOperations;
import org.springframework.social.instagram.api.UserOperations;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;

/**
 *
 * @author Cornelius M
 */
public class InstagramTemplate extends AbstractOAuth2ApiBinding implements Instagram {

    private final String accessToken;

    public InstagramTemplate(String accessToken) {
        super(accessToken);
        this.accessToken = accessToken;
    }

    @Override
    public TagsOperations tagOperations() {
        return new TagsOperationsTemplate(this);
    }

    @Override
    public LocationOperations locationOperations() {
        return new LocationOperationsTemplate(this);
    }

    @Override
    public MediaOperations mediaOperations() {
        return new MediaOperationsTemplate(this);
    }

    @Override
    public UserOperations userOperations() {
        return new UserOperationsTemplate(this);
    }

    public String getAccessToken() {
        return accessToken;
    }
}
