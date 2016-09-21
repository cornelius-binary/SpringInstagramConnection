package org.springframework.social.instagram.connect;

import org.springframework.social.instagram.api.Instagram;
import org.springframework.social.connect.support.OAuth2ConnectionFactory;

public class InstagramConnectionFactory extends OAuth2ConnectionFactory<Instagram> {
    /**
     * Creates Instagram Connection using application id and application secret
     * @param appId application id provided by instagram
     * @param appSecret application secret provided by instagram
     */
    public InstagramConnectionFactory(String appId, String appSecret) {
        super("instagram", new InstagramServiceProvider(appId, appSecret), new InstagramAdapter());
    }
}
