/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.springframework.social.instagram.api.impl;

/**
 *Used to construct user profile. 
 * <h4>Fields</h4>
 * <ol>
 * <li>Full Name</li>
 * <li>Username</li>
 * <li>profile picture url</li>
 * <li>bio description</li>
 * <li>Website url</li>
 * <li>User Statistics</li>
 * </ol>
 * @author Cornelius M.
 */
public class UserProfileTemplate {
    private Long id;
    private String full_name;
    private String username;
    private String profile_picture;
    private String bio;
    private String website;
    private UserStats  counts;
    private String profileUrl;

    @Override
    public String toString(){
        return "id: "+id+", full_name: "+full_name+", username: "+username+", profile_picture: "+profile_picture+","
                + " bio: "+bio+", website: "+website+", counts: "+counts+", profileUrl: "+profileUrl;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }   

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProfile_picture() {
        return profile_picture;
    }

    public void setProfile_picture(String profile_picture) {
        this.profile_picture = profile_picture;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public UserStats getCounts() {
        return counts;
    }

    public void setCounts(UserStats counts) {
        this.counts = counts;
    }

    public String getProfileUrl() {
        return "https://www.instagram.com/"+username;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }
    
    
    
}
