/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cm.spring.social.instagram.api.models;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.social.ResourceNotFoundException;
import org.springframework.social.ServerException;
import org.springframework.web.client.DefaultResponseErrorHandler;

/**
 *
 * @author Cornelius M
 */
public class InstagramErrorHandler extends DefaultResponseErrorHandler {
    private ObjectMapper mapper;
    public InstagramErrorHandler(){
        mapper = new ObjectMapper(new JsonFactory());
    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        if (response.getStatusCode() == HttpStatus.BAD_REQUEST) {
            this.handleBadRequest(response);
        } else {
            super.handleError(response);
        }
    }

    private void handleBadRequest(ClientHttpResponse response) {        
        ErrorResponse errorRes = this.parseErrorStream(response);
        System.out.println("----------------------------------------Error: "+errorRes.getMeta().getError_message());
        if(errorRes.getMeta().getError_message().contains("this user does not exist")){
            throw new ResourceNotFoundException("instagram", Constants.USER_NOT_FOUND);
        }else{
            throw new ServerException("instagram", Constants.UNDEFINED_EXCEPTION);
        }
    }
    /**
     * Decode json response
     * @param body json string 
     * @return
     * @throws IOException 
     */
    private Map<String, Object> extractErrorDetailsFromResponse(String body) throws IOException {
        //ObjectMapper mapper = new ObjectMapper(new JsonFactory());
        try {
            return mapper.<Map<String, Object>>readValue(body, new TypeReference<Map<String, Object>>() {
            });
        } catch (JsonParseException e) {
            return Collections.emptyMap();
        }
    }
    
    private ErrorResponse parseErrorStream(ClientHttpResponse response){
        try {
            return mapper.readValue(response.getBody(), ErrorResponse.class);            
        } catch (IOException ex) {
            Logger.getLogger(InstagramErrorHandler.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
