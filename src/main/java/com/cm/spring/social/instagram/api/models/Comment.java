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

public class Comment{
    private String count;
    private Long created_time;
    private String text;
    private UserProfileTemplate from;
    private Long id;
    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public Long getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Long created_time) {
        this.created_time = created_time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public UserProfileTemplate getFrom() {
        return from;
    }

    public void setFrom(UserProfileTemplate from) {
        this.from = from;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
}
