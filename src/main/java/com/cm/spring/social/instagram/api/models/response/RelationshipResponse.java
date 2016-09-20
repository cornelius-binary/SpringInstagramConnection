/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cm.spring.social.instagram.api.models.response;

import com.cm.spring.social.instagram.api.models.Relationship;

/**
 *
 * @author Cornelius M
 */
public class RelationshipResponse {
    private Relationship data;
    
    public RelationshipResponse(){
        
    }

    public Relationship getData() {
        return data;
    }

    public void setData(Relationship data) {
        this.data = data;
    }
    
    
}
