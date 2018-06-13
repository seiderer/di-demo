package de.seidererp.didemo.controllers;

import de.seidererp.didemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

// DAS GEGENBEISPIEL, WIE MAN ES NICHT MACHT
@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingServiceImpl;

    public String sayHello() {
        return greetingServiceImpl.sayHello();
    }

    public GreetingService getService() {
        return greetingServiceImpl;
    }
}
