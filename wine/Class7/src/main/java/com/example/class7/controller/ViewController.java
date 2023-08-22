package com.example.class7.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Flux;

import java.time.Duration;

public class ViewController {

    @GetMapping("/")
    String index(){
        return "index";

   }
}

