package com.zergatstage.gbsprings06.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Stores a tunes of project in properties files
 */
@Component
public class URLtemplates {
    @Value("${external.api.url}")
    private String externalApiUrl;

    public String getApiUrl(){
        return this.externalApiUrl;
    }
}
