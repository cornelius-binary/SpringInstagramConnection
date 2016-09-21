/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.springframework.social.instagram.api.impl.response;

import org.springframework.social.instagram.api.impl.Tag;

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
