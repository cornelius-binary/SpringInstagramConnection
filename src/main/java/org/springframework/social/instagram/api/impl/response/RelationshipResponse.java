/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.springframework.social.instagram.api.impl.response;

import org.springframework.social.instagram.api.impl.Relationship;

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
