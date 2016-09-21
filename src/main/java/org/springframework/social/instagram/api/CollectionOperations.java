/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.springframework.social.instagram.api;

import org.springframework.social.instagram.api.impl.Location;
import java.util.Collection;

/**
 *
 * @author Cornelius M.
 */
public interface CollectionOperations {
    /**
     * Get information about a location.
     * @param locationId 
     * @return Location object
     */
    public Location getLocation(Long locationId);
    /**
     * Get a list of recent media objects from a given location
     * @param locationId 
     * @param minId Return media before this min_id
     * @param maxId Return media after this max_id
     * @return a Collection of Locations
     */
    public Collection<Location> getRecentLocations(Long locationId, Long minId, Long maxId);
    /**     * 
     * @param latitude Latitude of the center search coordinate. If used, lng is required.
     * @param longitude Longitude of the center search coordinate. If used, lat is required.
     * @param distance Default is 500m (distance=500), max distance is 750.
     * @return 
     */
    public Collection<Location> searchLocations(float latitude, float longitude, float distance);
    /**
     * Search for a location by geographic coordinate.
     * @param facebookPlacesId Returns a location mapped off of a Facebook places id. If used, lat and lng are not required.
     * @param distance Default is 500m (distance=500), max distance is 750.
     * @return 
     */
    public Collection<Location> searchlocations(float facebookPlacesId, float distance);
}
