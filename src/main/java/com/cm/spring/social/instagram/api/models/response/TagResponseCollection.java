/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cm.spring.social.instagram.api.models.response;

import com.cm.spring.social.instagram.api.models.Tag;
import java.util.Collection;

/**
 *
 * @author Cornelius M
 */
public class TagResponseCollection {

    private Collection<Tag> data;

    public TagResponseCollection() {

    }

    public Collection<Tag> getData() {
        return data;
    }

    public void setData(Collection<Tag> data) {
        this.data = data;
    }

}
