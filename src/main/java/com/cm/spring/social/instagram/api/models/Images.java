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
public class Images{
    private VisualMedia low_resolution;
    private VisualMedia thumbnail;
    private VisualMedia standard_resolution;

    public VisualMedia getLow_resolution() {
        return low_resolution;
    }

    public void setLow_resolution(VisualMedia low_resolution) {
        this.low_resolution = low_resolution;
    }

    public VisualMedia getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(VisualMedia thumbnail) {
        this.thumbnail = thumbnail;
    }

    public VisualMedia getStandard_resolution() {
        return standard_resolution;
    }

    public void setStandard_resolution(VisualMedia standard_resolution) {
        this.standard_resolution = standard_resolution;
    }
    
    
}