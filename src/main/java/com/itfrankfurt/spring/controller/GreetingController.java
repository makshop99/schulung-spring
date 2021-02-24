package com.itfrankfurt.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class GreetingController {
    @GetMapping("/greet")
    public String greet() {
        return "Hello World!";
    }
    @GetMapping("/greet2")
    public String greet2() {
        return "Hello World!";
    }
    @GetMapping("/greet/Lebkuchen")
    public String greetByName() {
        return "Merry christmas";
    }
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name) {
        return "Hello " + name;
    }
//    @GetMapping("/greet/{firstName}/{lastName}")
//    public String greetByFirstAndLastName(@PathVariable String firstName, @PathVariable String lastName) {
//        return "Hello " + firstName + " " + lastName;
//    }
    @GetMapping("/greet/withLastName/{firstName}")
    public String greetByFirstNameAndLastName(@PathVariable String firstName, @RequestParam(required = false, defaultValue = "Namenlos") String lastName) {
        return "Hello " + firstName + " " + lastName;
    }
}
