/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cm.spring.social.instagram;


import com.cm.spring.social.instagram.api.Instagram;
import com.cm.spring.social.instagram.api.models.UserProfileTemplate;
import org.springframework.social.ApiException;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;

/**
 *
 * @author Cornelius M
 */
public class InstagramAdapter implements ApiAdapter<Instagram> {

    @Override
    public boolean test(Instagram api) {
        try {
            api.userOperations().getUser();
            return true;
        } catch (ApiException ex) {
            
            return false;
        }
    }

    @Override
    public void setConnectionValues(Instagram api, ConnectionValues values) {
        UserProfileTemplate userProfile = api.userOperations().getUser();
        values.setDisplayName(userProfile.getFull_name());
        values.setImageUrl(userProfile.getProfile_picture());
        values.setProfileUrl(userProfile.getProfileUrl());
        values.setProviderUserId(userProfile.getId().toString());
        
    }

    @Override
    public UserProfile fetchUserProfile(Instagram api) {
        //return new UserProfile(String id, String name, String firstName, String lastName, String email, String username);
        UserProfileTemplate userProfile = api.userOperations().getUser();
        return new UserProfileBuilder().setId(userProfile.getId().toString()).setName(userProfile.getFull_name()).build();
    }

    @Override
    public void updateStatus(Instagram api, String message) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
