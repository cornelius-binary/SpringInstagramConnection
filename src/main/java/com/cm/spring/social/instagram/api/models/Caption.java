/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cm.spring.social.instagram.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author Cornelius M
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Caption {
    private String created_time;
    private String text;
    private UserProfileTemplate from;
    
    public Caption(){
        
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setFrom(UserProfileTemplate from) {
        this.from = from;
    }
    
    
    
    

}
