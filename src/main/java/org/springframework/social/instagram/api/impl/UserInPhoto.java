/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.springframework.social.instagram.api.impl;

/**
 *
 * @author Cornelius M
 */
public class UserInPhoto{
    private UserProfileTemplate user;
    private Location position;

    public UserProfileTemplate getUser() {
        return user;
    }

    public void setUser(UserProfileTemplate user) {
        this.user = user;
    }

    public Location getPosition() {
        return position;
    }

    public void setPosition(Location position) {
        this.position = position;
    }
    
    
    
}