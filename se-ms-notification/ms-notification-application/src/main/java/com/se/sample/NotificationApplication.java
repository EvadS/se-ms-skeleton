package com.se.sample;

//import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.se.sample.data.api.client.DataClient;
import com.se.sample.data.api.client.DataClientV1;
import com.se.sample.data.rest.dto.NoteResponse;
import com.se.sample.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

@EnableAutoConfiguration
@SpringBootApplication
public class NotificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }
@Autowired
DataService dataServicel;

@PostConstruct
    private  void init(){

    dataServicel.test();
    int a =2;
}
}
