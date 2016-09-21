/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.springframework.social.instagram.api;

import org.springframework.social.instagram.api.impl.Location;
import org.springframework.social.instagram.api.impl.Media;
import java.util.Collection;

/**
 *
 * @author Cornelius M.
 */
public interface LocationOperations {
    
    public final String LOCATION_ENDPOINT = "locations/";
    
    /**
     * Used to get location using location id
     * @param locationId 
     * @return Location object
     */
    Location getLocation(String locationId);
    /**
     * Search for a location by geographic coordinate. 
     * @param latitude Latitude of the center search coordinate. If used, lng is required 
     * @param longitude Longitude of the center search coordinate. If used, lat is required.
     * @param distance Default is 500m (distance=500), max distance is 750. 
     * @return Collection of Location object
     */
    Collection<Location> searchLocation(String latitude, String longitude, float distance);
    /**
     * Search for a location by facebook place id
     * @param facebookPlacesId Returns a location mapped off of a Facebook places id.
     * @param distance Default is 500m (distance=500), max distance is 750.
     * @return Collection of Location object
     */
    Collection<Location> searchLocation(String facebookPlacesId, float distance);
    /**
     * Get a list of recent media objects from a given location.
     *
     * @param locationId Location id
     * @param minId Return media before this min_id
     * @param maxId Return media after this max_id.
     * @return a Collection of Media objects
     */
    public Collection<Media> findByLocation(String locationId, String minId, String maxId);

}
