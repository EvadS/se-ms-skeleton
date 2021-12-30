package com.se.sample.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DataApplication {

   private final MyService myService;
//
//    public DemoApplication(MyService myService) {
//        this.myService = myService;
//    }
//
//    @GetMapping("/")
//    public String home() {
//        return myService.message();
//    }

    public static void main(String[] args) {
        SpringApplication.run(DataApplication.class, args);
    }
}
