/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.springframework.social.instagram.api.impl.response;

import org.springframework.social.instagram.api.impl.Media;
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
