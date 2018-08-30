package com.github.taller.zerosoffactorial.controller;

import com.github.taller.zerosoffactorial.data.Result;
import com.github.taller.zerosoffactorial.service.CountZerosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    private CountZerosService countZerosService;

    @ResponseBody
    @RequestMapping(value = "/calculate-zeros", method = RequestMethod.GET)
    public ResponseEntity<Result> getResult(@RequestParam("num") int num) {

        Result result = countZerosService.countZerosOfFactorialFrom(num);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
