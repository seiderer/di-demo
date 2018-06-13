package de.seidererp.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Inject by Constructor";
    }
}
