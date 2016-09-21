/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.springframework.social.instagram.api.impl.response;

import org.springframework.social.instagram.api.impl.Media;

/**
 *
 * @author Cornelius M
 */
public class MediaResponse {
    private Media data;
    
    public MediaResponse(){
        
    }

    public Media getData() {
        return data;
    }

    public void setData(Media data) {
        this.data = data;
    }
    
    
}
