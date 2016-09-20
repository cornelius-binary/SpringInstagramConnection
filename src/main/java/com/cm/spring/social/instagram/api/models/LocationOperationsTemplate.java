/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cm.spring.social.instagram.api.models;

import com.cm.spring.social.instagram.api.LocationOperations;
import static com.cm.spring.social.instagram.api.MediaOperations.MEDIA_ENDPOINT;
import com.cm.spring.social.instagram.api.models.response.LocationCollectionResponse;
import com.cm.spring.social.instagram.api.models.response.LocationResponse;
import com.cm.spring.social.instagram.api.models.response.MediaCollectionResponse;
import com.cm.spring.social.instagram.api.models.response.MediaResponse;
import java.util.Collection;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

/**
 * Implements {@link LocationOperations} functionality
 *
 * @author Cornelius M
 */
public class LocationOperationsTemplate extends OperationsTemplate implements LocationOperations {

    public LocationOperationsTemplate(InstagramTemplate instagram) {
        super(instagram);
    }

    public Location getLocation(String locationId) {
        return get(buildAuthorizedUri(LOCATION_ENDPOINT + locationId), LocationResponse.class).getData();
    }

    public Collection<Location> searchLocation(String latitude, String longitude, float distance) {
        MultiValueMap<String, String> requestMap = new LinkedMultiValueMap();
        requestMap.add("distance", String.valueOf(distance));
        requestMap.add("lat", latitude);
        requestMap.add("lng", longitude);
        return get(buildUri(LOCATION_ENDPOINT + "search/", requestMap, true), LocationCollectionResponse.class).getData();
    }

    public Collection<Location> searchLocation(String facebookPlacesId, float distance) {
        MultiValueMap<String, String> requestMap = new LinkedMultiValueMap();
        requestMap.add("distance", String.valueOf(distance));
        requestMap.add("facebook_places_id", facebookPlacesId);
        return get(buildUri(LOCATION_ENDPOINT + "search/", requestMap, true), LocationCollectionResponse.class).getData();
    }

    public Collection<Media> findByLocation(String locationId, String minId, String maxId) {
        MultiValueMap<String, String> requestMap = new LinkedMultiValueMap();
        requestMap.add("min_id", minId);
        requestMap.add("max_id", maxId);
        return get(buildUri(LOCATION_ENDPOINT + locationId + "/media/recent/", requestMap, true), MediaCollectionResponse.class).getData();
    }

}
