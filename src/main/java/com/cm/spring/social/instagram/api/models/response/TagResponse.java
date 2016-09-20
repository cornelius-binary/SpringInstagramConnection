/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cm.spring.social.instagram.api.models.response;

import com.cm.spring.social.instagram.api.models.Tag;

/**
 *
 * @author Cornelius M
 */
public class TagResponse {
    private Tag data;
    
    public TagResponse(){
        
    }

    public Tag getData() {
        return data;
    }

    public void setData(Tag data) {
        this.data = data;
    }
    
    
}
