package de.seidererp.didemo.controllers;

import de.seidererp.didemo.service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @Test
    public void sayHello() {
        assertEquals(GreetingServiceImpl.GREETING, setterInjectedController.sayHello());
    }

    @Before
    public void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }
}