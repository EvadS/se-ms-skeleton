package com.se.sample.notification.rest;

import com.se.ms.data.api.client.DataClient;
import com.se.ms.data.rest.dto.NoteResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/notification")
@RequiredArgsConstructor
public class IndexController {
//    private final DataService dataService;

    private final DataClient dataClient;

    @GetMapping("/")
    public NoteResponse test() {
        log.info("Handle test API");
//        return dataService.test();
    return  null;
    }
}
