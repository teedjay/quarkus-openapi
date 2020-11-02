package com.teedjay;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class SecurityOASFilterUrlOverride {

    @ConfigProperty(name = "my.authorization.url")
    String url;

    void startup(@Observes StartupEvent event) { 
        // small hack, override static url in the OpenAPI filter to provide dynamic values
        SecurityOASFilter.url = url;
    }

}
