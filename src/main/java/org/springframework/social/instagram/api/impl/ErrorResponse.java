/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.social.instagram.api.impl;

/**
 * Used to model error responses
 *
 * @author Cornelius M
 */
public class ErrorResponse {

    private Meta meta;
    
    public ErrorResponse(){
        
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    class Meta {

        private String error_type;
        private int code;
        private String error_message;
        
        public Meta(){
            
        }

        public String getError_type() {
            return error_type;
        }

        public void setError_type(String error_type) {
            this.error_type = error_type;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getError_message() {
            return error_message;
        }

        public void setError_message(String error_message) {
            this.error_message = error_message;
        }

    }
}
