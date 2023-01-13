package com.example.logback;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
@RequiredArgsConstructor
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String handle(Exception e) {
        log.error("error", e);
        return "error log";
    }

    @ExceptionHandler(IllegalAccessException.class)
    public String handle(IllegalAccessException e) {
        log.error("run time error", e);
        return "IllegalAccessException error log";
    }
}
