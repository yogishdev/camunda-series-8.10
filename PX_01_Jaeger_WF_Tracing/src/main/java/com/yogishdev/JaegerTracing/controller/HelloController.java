package com.yogishdev.JaegerTracing.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/")
public class HelloController {




    @GetMapping("/hello")
    public String hello(){
        return "World";
    }


    @GetMapping("/delay")
    public Map<String, Object> getDelayedTrace() throws InterruptedException {
        long startTime = System.currentTimeMillis();

        // Simulate a database query or external API call delay
        Thread.sleep(350);

        long duration = System.currentTimeMillis() - startTime;

        Map<String, Object> response = new HashMap<>();
        response.put("status", "completed");
        response.put("simulated_latency_ms", duration);
        return response;
    }
}
