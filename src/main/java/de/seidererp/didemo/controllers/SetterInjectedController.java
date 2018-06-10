package de.seidererp.didemo.controllers;

import de.seidererp.didemo.service.GreetingService;

// EIN GEGENBEISPIEL
public class SetterInjectedController {

    private GreetingService greetingService;

    String sayHello() {
        return greetingService.sayHello();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

}
