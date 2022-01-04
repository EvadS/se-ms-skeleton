package com.se.sample.data.application;


import com.se.sample.common.MyService;
import com.se.sample.common.ServiceProperties;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(scanBasePackages = {"com.se.sample.common"})
@EnableConfigurationProperties({ServiceProperties.class})
public class DataApplication implements CommandLineRunner {


    private final MyService myService;

    public DataApplication(MyService myService) {
        this.myService = myService;
    }

    public static void main(String[] args) {
        SpringApplication.run(DataApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return myService.message();
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
