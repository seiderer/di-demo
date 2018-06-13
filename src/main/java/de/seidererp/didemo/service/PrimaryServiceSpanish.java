package de.seidererp.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimaryServiceSpanish implements GreetingService {
    @Override
    public String sayHello() {
        return "SPANISH";
    }
}
