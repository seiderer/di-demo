package de.seidererp.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String GREETING = "Griaß God!";

    @Override
    public String sayHello() {
        return GREETING;
    }
}
