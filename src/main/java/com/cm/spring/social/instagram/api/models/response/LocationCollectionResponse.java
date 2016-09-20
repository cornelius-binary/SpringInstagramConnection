/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cm.spring.social.instagram.api.models.response;

import com.cm.spring.social.instagram.api.models.Location;
import java.util.Collection;

/**
 *
 * @author Cornelius M
 */
public class LocationCollectionResponse {
    public Collection<Location> data;
    public LocationCollectionResponse(){
        
    }

    public Collection<Location> getData() {
        return data;
    }

    public void setData(Collection<Location> data) {
        this.data = data;
    }

    
    
    

}
