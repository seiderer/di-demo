package de.seidererp.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Injected per Setter";
    }
}
