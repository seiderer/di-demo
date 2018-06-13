package de.seidererp.didemo.controllers;

import de.seidererp.didemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// EIN GEGENBEISPIEL
@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello() {

        return greetingService.sayHello();
    }

    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService) {

        this.greetingService = greetingService;
    }

}
