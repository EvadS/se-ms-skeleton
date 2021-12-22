package com.se.sample.parent;

import com.se.sample.parent.config.ConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(ConfigProperties.class)
@SpringBootApplication
public class SeMsParentApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeMsParentApplication.class, args);
    }

}
