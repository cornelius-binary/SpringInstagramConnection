/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cm.spring.social.instagram.api.models;

import com.cm.spring.social.instagram.api.Instagram;
import com.cm.spring.social.instagram.api.LocationOperations;
import com.cm.spring.social.instagram.api.MediaOperations;
import com.cm.spring.social.instagram.api.TagsOperations;
import com.cm.spring.social.instagram.api.UserOperations;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;

/**
 *
 * @author Cornelius M
 */
public class InstagramTemplate extends AbstractOAuth2ApiBinding implements Instagram {
    private String accessToken;
    public InstagramTemplate(String accessToken){
        super(accessToken);
        this.accessToken = accessToken;
    }

    @Override
    public TagsOperations tagOperations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LocationOperations locationOperations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
return accessToken;    }
}
