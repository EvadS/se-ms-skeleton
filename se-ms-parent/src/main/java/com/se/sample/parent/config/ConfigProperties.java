package com.se.sample.parent.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Data
@Configuration
@ConfigurationProperties(prefix = "mail")
public class ConfigProperties {

    private String hostName;
    private int port;
    private String from;

    // standard getters and setters

    @PostConstruct
    private void  init(){
        int a=0;
    }

}