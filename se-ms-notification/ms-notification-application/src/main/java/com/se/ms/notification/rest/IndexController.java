package com.se.ms.notification.rest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import com.se.ms.data.api.client.*;

@Slf4j
@RestController
@RequestMapping("/notification")
@RequiredArgsConstructor
public class IndexController {

   //private  DataService dataService;

   // DataClient dataClient;

//    private final DataClient dataClient;
//
//    @GetMapping("/test")
//    public NoteResponse test() {
//        log.info("Handle test API");
//        return dataClient.getNoteById(1l);
//       }
}
