package com.busybee.backend.controllers;

import com.busybee.backend.models.Count;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

public class CountController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Count greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Count(counter.incrementAndGet(), String.format(template, name));
    }
}
