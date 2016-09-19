/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cm.spring.social.instagram.api.models;

/**
 * used to model profile response
 * @author Cornelius M
 */
public class UserProfileResponse {
    private UserProfileTemplate data;
    private ErrorResponse meta;

    public UserProfileTemplate getData() {
        return data;
    }

    public void setData(UserProfileTemplate data) {
        this.data = data;
    }

    public ErrorResponse getMeta() {
        return meta;
    }

    public void setMeta(ErrorResponse meta) {
        this.meta = meta;
    }
    
    
    
    
}
