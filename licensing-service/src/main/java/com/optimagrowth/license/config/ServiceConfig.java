package com.optimagrowth.license.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@ConfigurationProperties(prefix = "example")
public class ServiceConfig {

    private String property;

    public String getProperty() {
        return property;
    }
}
