/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cm.spring.social.instagram.api.models;

/**
 *
 * @author Cornelius M
 */
public class UserProfileResponse {
    private UserProfileTemplate data;

    public UserProfileTemplate getData() {
        return data;
    }

    public void setData(UserProfileTemplate data) {
        this.data = data;
    }
    
    
}
