/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cm.spring.social.instagram.api.models;

import java.net.URI;
import java.util.Map;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author Cornelius M
 */
public class OperationsTemplate {

    final private InstagramTemplate instagram;
    final private String BASE_URL = "https://api.instagram.com/v1/";
    private final RestTemplate restTemplate;

    public OperationsTemplate(InstagramTemplate instagram) {
        this.instagram = instagram;
        restTemplate = instagram.getRestTemplate();

        restTemplate.setErrorHandler(new InstagramErrorHandler());
    }

    /**
     * Process get requests
     *
     * @param <T> model class
     * @param url
     * @param object response class
     * @return
     */
    protected <T> T get(URI url, Class<T> object) {
        return restTemplate.getForObject(url, object);
    }

    /**
     * Process post requests
     *
     * @param <C>
     * @param url
     * @param params
     * @param object
     * @return
     */
    protected <C> C post(URI url, MultiValueMap<String, Object> params, Class<C> object) {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.MULTIPART_FORM_DATA);
//        HttpEntity entity = new HttpEntity(headers);
//        return restTemplate.exchange(url, HttpMethod.POST, entity, object).getBody();
        return restTemplate.postForObject(url, params, object);
    }

    protected URI buildUri(String path) {
        return buildUri(path, null, false);
    }

    protected URI buildAuthorizedUri(String path) {
        return buildUri(path, new LinkedMultiValueMap(), true);
    }

    /**
     * Used to build {@link URI} using query parameters
     *
     * @param path base url
     * @param params query parameters
     * @param isAuthorized specify if to construct a authentication url
     * @return
     */
    protected URI buildUri(String path, MultiValueMap<String, String> params, boolean isAuthorized) {
        if (isAuthorized) {
            params.add("access_token", instagram.getAccessToken());
        }
        path = BASE_URL + path;
        UriComponents uri = (params == null) ? UriComponentsBuilder.fromUriString(path).build() : UriComponentsBuilder.fromUriString(path).queryParams(params).build();
        return uri.toUri();
    }
}
