package com.gramer.oop.callcenter;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;



public class CallHandlerTest {

    @Test
    public void empCanHandle() {
        Employee director = new Director("kkj");
        assertTrue(director.canHandle(new Call(Rank.RESPONDANT)));
        assertTrue(director.canHandle(new Call(Rank.MANAGER)));
        assertTrue(director.canHandle(new Call(Rank.DIRECTOR)));
        
        Employee respondant = new Respondant("kmj");
        assertTrue(respondant.canHandle(new Call(Rank.RESPONDANT)));
        assertFalse(respondant.canHandle(new Call(Rank.MANAGER)));
        assertFalse(respondant.canHandle(new Call(Rank.DIRECTOR)));
    }

}
