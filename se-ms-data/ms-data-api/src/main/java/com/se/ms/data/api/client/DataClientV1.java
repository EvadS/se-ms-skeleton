package com.se.ms.data.api.client;

import com.se.ms.data.util.PathUtil;
import com.se.ms.data.rest.dto.NoteResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RequiredArgsConstructor
public class DataClientV1 implements  DataClient{

    private final String baseUrl;
    private final RestTemplate restTemplate;

    @Override
    public NoteResponse getNoteById(Long id){
        String url = PathUtil.combine(baseUrl, "/notes/{id}");
        return restTemplate.getForObject(url, NoteResponse.class, id);
    }
}
