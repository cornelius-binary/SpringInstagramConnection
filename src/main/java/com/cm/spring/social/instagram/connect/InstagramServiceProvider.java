/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cm.spring.social.instagram.connect;

import com.cm.spring.social.instagram.api.Instagram;
import com.cm.spring.social.instagram.api.models.InstagramTemplate;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.oauth2.OAuth2Operations;
import org.springframework.social.oauth2.OAuth2Template;

/**
 *
 * @author Cornelius M
 */
public class InstagramServiceProvider extends AbstractOAuth2ServiceProvider<Instagram> {
    private static String authorizationUrl = "https://api.instagram.com/oauth/authorize";
    private static String authenticateUrl = "";
    private static String accessTokenUrl = "https://api.instagram.com/oauth/access_token";
    
    public InstagramServiceProvider(String appId, String appSecret){
        super(getOAuth2Template(appId, appSecret));
    }

    public InstagramServiceProvider(OAuth2Operations oauth2Operations) {
        super(oauth2Operations);
    }

    @Override
    public Instagram getApi(String accessToken) {
            return new InstagramTemplate(accessToken);
    }
    
    private static OAuth2Template getOAuth2Template(String appId, String appSecret) {
		OAuth2Template oAuth2Template = new OAuth2Template(appId, appSecret, authorizationUrl, accessTokenUrl);
		oAuth2Template.setUseParametersForClientAuthentication(true);
		return oAuth2Template;
}

}
