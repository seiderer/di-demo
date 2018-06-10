package de.seidererp.didemo.controllers;

import de.seidererp.didemo.service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @Test
    public void sayHello() {
        assertEquals(GreetingServiceImpl.GREETING, constructorInjectedController.sayHello());
    }

    @Before
    public void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }


}