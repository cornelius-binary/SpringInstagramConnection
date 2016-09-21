/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.social.instagram.api.impl.response;

import org.springframework.social.instagram.api.impl.Tag;
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
