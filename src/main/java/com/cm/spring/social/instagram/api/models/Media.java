/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cm.spring.social.instagram.api.models;

import java.util.List;

/**
 *
 * @author Cornelius M
 */
public class Media {
    private float distance;
    private String type;
    private List<UserInPhoto> users_in_photo;
    private String filter;
    private String[] tags;
    private Comment comments;
    private String caption;
    private Likes likes;
    private String link;
    private UserProfileTemplate user;
    private Long created_time;
    private Images images;
    private Long id;
    private String location;
    private Videos videos;

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }
    
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<UserInPhoto> getUsers_in_photo() {
        return users_in_photo;
    }

    public void setUsers_in_photo(List<UserInPhoto> users_in_photo) {
        this.users_in_photo = users_in_photo;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public Comment getComments() {
        return comments;
    }

    public void setComments(Comment comments) {
        this.comments = comments;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Likes getLikes() {
        return likes;
    }

    public void setLikes(Likes likes) {
        this.likes = likes;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public UserProfileTemplate getUser() {
        return user;
    }

    public void setUser(UserProfileTemplate user) {
        this.user = user;
    }

    public Long getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Long created_time) {
        this.created_time = created_time;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Videos getVideos() {
        return videos;
    }

    public void setVideos(Videos videos) {
        this.videos = videos;
    }
    
    
    
    

}










