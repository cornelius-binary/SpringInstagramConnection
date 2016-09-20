/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cm.spring.social.instagram.api.models;

import com.cm.spring.social.instagram.api.LocationOperations;
import java.util.Collection;

/**
 * Implements {@link LocationOperations} functionality
 * @author Cornelius M
 */
public class LocationOperationsTemplate implements LocationOperations {

    public Location getLocation(Long locationId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Collection<Location> searchLocation(Long latitude, Long longitude, float distance) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Collection<Location> searchLocation(Long facebookPlacesId, float distance) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Collection<Media> findByLocation(String locationId, Long minId, Long maxId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
