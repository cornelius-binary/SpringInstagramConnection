/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.social.instagram.api.impl.response;

import org.springframework.social.instagram.api.impl.Location;

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
