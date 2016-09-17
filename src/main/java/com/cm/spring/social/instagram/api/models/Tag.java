/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cm.spring.social.instagram.api.models;

/**
 *
 * @author Cornelius M
 */
public class Tag {
    private Long media_count;
    private String nofilter;

    public Long getMedia_count() {
        return media_count;
    }

    public void setMedia_count(Long media_count) {
        this.media_count = media_count;
    }

    public String getNofilter() {
        return nofilter;
    }

    public void setNofilter(String nofilter) {
        this.nofilter = nofilter;
    }
    
    
}
