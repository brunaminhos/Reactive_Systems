package com.example.class7.controller;

import com.example.class7.models.Wine;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.time.Duration;

public class MyController {
    //text/event-stream
    @GetMapping(path = "/numbers", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    Flux<String> numbers() {
        return Flux.interval(Duration.ofSeconds(1)).map(num -> num.toString());
        //return Flux.interval(Duration.ofSeconds(1)).map(num -> "<p>" + num + "<p>");

    }
    @GetMapping(path = "/wine", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    Flux<Wine> wine(){
        return WebClient.create("https://api.sampleapis.com/wines/reds")
                .get()
                .retrieve()
                .bodyToFlux(Wine.class);


    }
}
