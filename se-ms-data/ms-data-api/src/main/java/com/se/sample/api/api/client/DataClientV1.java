package com.se.sample.api.api.client;


import com.se.sample.api.rest.dto.NoteResponse;
import com.se.sample.api.util.PathUtil;
import org.springframework.web.client.RestTemplate;


public class DataClientV1 implements  DataClient{

    private String baseUrl;
    private RestTemplate restTemplate;
    public DataClientV1(String baseUrl, RestTemplate restTemplate) {
        this.baseUrl=baseUrl;
        this.restTemplate=restTemplate;
    }

    @Override
    public NoteResponse getNoteById(Long id){
        String url = PathUtil.combine(baseUrl, "/notes/{id}");
        return restTemplate.getForObject(url, NoteResponse.class, id);
    }
}
