package de.seidererp.didemo.controllers;

import de.seidererp.didemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    @Autowired
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {

        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayHello();
    }

}
