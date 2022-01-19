package com.se.ms.notification;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages = {
        "com.se.sample.common",
        "com.se.ms.data",
        "com.se.ms.notification"
})

@ComponentScan({ "com.se.sample.common",
        "com.se.ms.data",
        "com.se.ms.notification" })
public class NotificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }

//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.se.sample.notification.application.rest"))
//                .paths(paths())
//                .build();
//
//    }
//    // Only select apis that matches the given Predicates.
//    private Predicate<String> paths() {
//        // Match all paths except /error
//        return Predicates.and(
//                PathSelectors.regex("/.*"),
//                Predicates.not(PathSelectors.regex("/error.*"))
//        );
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder().title("Agent API documentation").description("Agent API").version("1.0").build();
//    }
}
