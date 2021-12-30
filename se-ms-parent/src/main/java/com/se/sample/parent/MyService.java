package com.se.sample.parent;

import com.se.sample.parent.config.ServiceProperties;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final ServiceProperties serviceProperties;

    public MyService(ServiceProperties serviceProperties) {
        this.serviceProperties = serviceProperties;
    }

    public String message() {
        return this.serviceProperties.getMessage();
    }
}