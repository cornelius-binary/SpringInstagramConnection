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
public class Videos{
    private VisualMedia low_resolution;
    private VisualMedia standard_resolution;

    public VisualMedia getLow_resolution() {
        return low_resolution;
    }

    public void setLow_resolution(VisualMedia low_resolution) {
        this.low_resolution = low_resolution;
    }

    public VisualMedia getStandard_resolution() {
        return standard_resolution;
    }

    public void setStandard_resolution(VisualMedia standard_resolution) {
        this.standard_resolution = standard_resolution;
    }
    
}
