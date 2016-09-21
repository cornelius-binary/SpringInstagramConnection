/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.springframework.social.instagram.api.impl;

/**
 *
 * @author Cornelius M
 */
public class Tag {
    private Long media_count;
    private String name;

    public Long getMedia_count() {
        return media_count;
    }

    public void setMedia_count(Long media_count) {
        this.media_count = media_count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
