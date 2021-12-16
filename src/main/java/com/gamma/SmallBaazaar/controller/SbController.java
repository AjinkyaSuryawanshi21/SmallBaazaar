package com.gamma.SmallBaazaar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SbController {

    @GetMapping("/")
    public String test(){
        return "Hello there";
    }
}
