/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cm.spring.social.instagram.api.models;

/**
 *Used to model Instagram user relation
 * @author Cornelius M
 */
public class Relationship {
    /**
     * Can be 'follows', 'requested', 'none'
     */
    private String outgoing_status;
    /**
     * Can be 'followed_by', 'requested_by', 'blocked_by_you'
     */
    private String incoming_status;

    public String getOutgoing_status() {
        return outgoing_status;
    }

    public void setOutgoing_status(String outgoing_status) {
        this.outgoing_status = outgoing_status;
    }

    public String getIncoming_status() {
        return incoming_status;
    }

    public void setIncoming_status(String incoming_status) {
        this.incoming_status = incoming_status;
    }
    
    
}
