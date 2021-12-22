package com.se.sample.api.api.config;

import com.se.sample.api.api.client.DataClientV1;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;



@Configuration
public class DataClientAutoConfiguration {

    @Primary
    @Bean(name="basicDataClient")
    @ConditionalOnProperty("{data.ms.v1.url}")
    public DataClientV1 getDataClientV1(
            @Value("${data.ms.v1.url}") String baseUrl,
            @Qualifier("restTemplateNoDicscovery") RestTemplate restTemplate){
        return new DataClientV1(baseUrl, restTemplate);
    }

    @PostConstruct
    private void init(){
        int a =0;



    }


}
