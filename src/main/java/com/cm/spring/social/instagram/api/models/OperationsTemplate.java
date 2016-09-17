/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cm.spring.social.instagram.api.models;

import java.net.URI;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author Cornelius M
 */
public class OperationsTemplate {

    final private InstagramTemplate instagram;
    final private String BASE_URL = "https://api.instagram.com/v1/";

    public OperationsTemplate(InstagramTemplate instagram) {
        this.instagram = instagram;
    }

    protected <T> T get(URI url, Class<T> object) {
        return instagram.getRestTemplate().getForObject(url, object);
    }

    protected URI buildUri(String path) {
        return buildUri(path, null);
    }

    protected URI buildUri(String path, MultiValueMap<String, String> params) {     
        path = BASE_URL + path;
        UriComponents uri = (params == null) ? UriComponentsBuilder.fromUriString(path).build() :UriComponentsBuilder.fromUriString(path).queryParams(params).build();        
        return uri.toUri();
    }
}
