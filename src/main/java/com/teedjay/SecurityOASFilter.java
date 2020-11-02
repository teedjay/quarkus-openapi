package com.teedjay;

import org.eclipse.microprofile.openapi.OASFilter;
import org.eclipse.microprofile.openapi.models.security.OAuthFlow;
import org.eclipse.microprofile.openapi.models.security.SecurityScheme;

public class SecurityOASFilter implements OASFilter {

    public static String url = "not-set";

    @Override
    public SecurityScheme filterSecurityScheme(SecurityScheme securityScheme) {
        if (securityScheme.getType().equals(SecurityScheme.Type.OAUTH2)) {
            System.out.printf("Changing authorizationUrl for '%s' to : %s%n", securityScheme.getType(), url);
            OAuthFlow flow = securityScheme.getFlows().getImplicit();
            flow.setAuthorizationUrl(url);
        }
        return securityScheme;
    }
    
}