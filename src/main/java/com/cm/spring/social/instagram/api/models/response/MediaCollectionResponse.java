/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cm.spring.social.instagram.api.models.response;

import com.cm.spring.social.instagram.api.models.Media;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Collection;

/**
 *used to model a collection of media response
 * @author Cornelius M
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MediaCollectionResponse {
    private Collection<Media> data;
   
    public MediaCollectionResponse(){        
    }

    public Collection<Media> getData() {
        return data;
    }

    public void setData(Collection<Media> data) {
        this.data = data;
    }    
    
}
