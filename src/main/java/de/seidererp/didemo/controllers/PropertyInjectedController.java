package de.seidererp.didemo.controllers;

import de.seidererp.didemo.service.GreetingService;

// DAS GEGENBEISPIEL, WIE MAN ES NICHT MACHT
public class PropertyInjectedController {

    public GreetingService greetingService;

    String sayHello() {
        return greetingService.sayHello();
    }

    public GreetingService getService() {
        return greetingService;
    }
}
