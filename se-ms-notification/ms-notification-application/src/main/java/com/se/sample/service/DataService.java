package com.se.sample.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DataService {

    final RestTemplate restTemplate;

    @Value("${data.ms.v1.url:'test'}")
    private String  baseUrl;



    public DataService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public void test() {
        int a =0;
    }
}
