/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.springframework.social.instagram.api.impl.response;

import org.springframework.social.instagram.api.impl.ErrorResponse;
import org.springframework.social.instagram.api.impl.UserProfileTemplate;

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
