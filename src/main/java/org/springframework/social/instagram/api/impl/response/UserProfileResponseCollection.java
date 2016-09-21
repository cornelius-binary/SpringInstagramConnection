/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.springframework.social.instagram.api.impl.response;

import org.springframework.social.instagram.api.impl.UserProfileTemplate;
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
