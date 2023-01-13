package com.example.logback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {


    @GetMapping("/test")
    public String test() {
        log.error("error");
        log.warn("warn");
        log.info("info");
        log.debug("debug");
        throw new RuntimeException("test");

    }


}
