package de.seidererp.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello() {
        System.out.println("Hallo DI");
        return "Hello Me";
    }
}
