package de.seidererp.didemo.controllers;

import de.seidererp.didemo.service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void sayHello() {
        assertEquals(GreetingServiceImpl.GREETING, propertyInjectedController.sayHello());
    }

}