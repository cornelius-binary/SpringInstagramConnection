/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cm.spring.social.instagram.api;

import com.cm.spring.social.instagram.api.models.Location;
import java.util.Collection;

/**
 *
 * @author Cornelius M.
 */
public interface LocationOperations {
    /**
     * Used to get location using location id
     * @param locationId 
     * @return Location object
     */
    Location getLocation(Long locationId);
    /**
     * Search for a location by geographic coordinate. 
     * @param latitude Latitude of the center search coordinate. If used, lng is required 
     * @param longitude Longitude of the center search coordinate. If used, lat is required.
     * @param distance Default is 500m (distance=500), max distance is 750. 
     * @return Collection of Location object
     */
    Collection<Location> searchLocation(Long latitude, Long longitude, float distance);
    /**
     * Search for a location by facebook place id
     * @param facebookPlacesId Returns a location mapped off of a Facebook places id.
     * @param distance Default is 500m (distance=500), max distance is 750.
     * @return Collection of Location object
     */
    Collection<Location> searchLocation(Long facebookPlacesId, float distance);

}
