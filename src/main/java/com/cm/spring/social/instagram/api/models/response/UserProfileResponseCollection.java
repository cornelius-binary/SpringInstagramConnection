/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cm.spring.social.instagram.api.models.response;

import com.cm.spring.social.instagram.api.models.UserProfileTemplate;
import java.util.Collection;

/**
 *
 * @author Cornelius M
 */
public class UserProfileResponseCollection {
    private Collection<UserProfileTemplate> data;

    public Collection<UserProfileTemplate> getData() {
        return data;
    }

    public void setData(Collection<UserProfileTemplate> data) {
        this.data = data;
    }
    
    

}
