package com.github.taller.zerosoffactorial.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice(basePackages = "com.github.taller")
public class ExceptionController {


    @ExceptionHandler(Throwable.class)
    public ResponseEntity<Map<String, String>> handleException(Exception ex) {

        Map<String, String> result = new HashMap<>();
        result.put("ERROR", ex.getMessage());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<Map<String, String>> handleMethodArgumentTypeMismatchException(Exception ex) {

        Map<String, String> result = new HashMap<>();
        result.put("ERROR", "Incorrect input value. The largest num value is " + Integer.MAX_VALUE);

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
    }
}
