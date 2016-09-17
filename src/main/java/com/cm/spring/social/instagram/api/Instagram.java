package com.cm.spring.social.instagram.api;

import org.springframework.social.ApiBinding;

public interface Instagram extends ApiBinding {

    /**
     * Returns the portion of the Instagram API that handles tag operations
     * @return 
     */
    TagsOperations tagOperations();

    /**
     * Returns the portion of the Instagram API that handles location operations
     * @return LocationOperations
     */
    LocationOperations locationOperations();

    /**
     * Returns the portion of the Instagram API that handles media operations
     * @return MediaOperations
     */
    MediaOperations mediaOperations();

    /**
     * Returns the portion of the Instagram API that handles user operations
     * @return UserOperations
     */
    UserOperations userOperations();
    /**
     * Used to retrieve current user access token
     * @return 
     */
    String getAccessToken();
}
