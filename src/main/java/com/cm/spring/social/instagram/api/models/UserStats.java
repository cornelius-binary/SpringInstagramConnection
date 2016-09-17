/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cm.spring.social.instagram.api.models;

/**
 * Used to frame user statistics i.e number of media, follows and followers
 * @author Cornelius M
 */
public class UserStats {
    private Long media;
    private Long follows;
    private Long followed_by;

    public Long getCounts() {
        return media;
    }

    public void setCounts(Long media) {
        this.media = media;
    }

    public Long getFollows() {
        return follows;
    }

    public void setFollows(Long follows) {
        this.follows = follows;
    }

    public Long getFollowed_by() {
        return followed_by;
    }

    public void setFollowed_by(Long followed_by) {
        this.followed_by = followed_by;
    }
    
    
}
