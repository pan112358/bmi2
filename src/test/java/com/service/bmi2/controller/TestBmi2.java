package com.service.bmi2.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestBmi2 {

        Bmi2Delegate bmi2Delegate = new Bmi2Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = bmi2Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}