/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cm.spring.social.instagram.api.models.response;

import com.cm.spring.social.instagram.api.models.Location;

/**
 *
 * @author Cornelius M
 */
public class LocationResponse {

    private Location data;

    public LocationResponse() {

    }

    public Location getData() {
        return data;
    }

    public void setData(Location data) {
        this.data = data;
    }

}
