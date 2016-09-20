/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cm.spring.social.instagram.api.models.response;

import com.cm.spring.social.instagram.api.models.Comment;
import java.util.Collection;

/**
 *
 * @author Cornelius M
 */
public class CommentCollectionResponse {
    private Collection<Comment> data;
    public CommentCollectionResponse(){
        
    }

    public Collection<Comment> getData() {
        return data;
    }

    public void setData(Collection<Comment> data) {
        this.data = data;
    }
    
    
}
