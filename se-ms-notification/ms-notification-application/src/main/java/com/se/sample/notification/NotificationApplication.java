package com.se.sample.notification;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;


@SpringBootApplication(scanBasePackages = {
        "com.se.sample.common",
        "com.se.ms.data",
        "com.se.sample.notification",
        "com.se.ms.data.api.config"
})
public class NotificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.se.sample.notification.application.rest"))
                .paths(paths())
                .build();

    }
    // Only select apis that matches the given Predicates.
    private Predicate<String> paths() {
        // Match all paths except /error
        return Predicates.and(
                PathSelectors.regex("/.*"),
                Predicates.not(PathSelectors.regex("/error.*"))
        );
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Agent API documentation").description("Agent API").version("1.0").build();
    }
}
