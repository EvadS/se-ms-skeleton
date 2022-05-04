package com.se.ms.notification;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages = {
        "com.se.ms.notification", "com.se.ms.data"
})


public class NotificationApplication {


    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }

}
