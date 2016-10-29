package com.example;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by narayansingh on 29/10/2016.
 */
public class HelloWorldTest {

    @Test
    public void shouldSayHello() {
        HelloWorld helloWorld = new HelloWorld();
        String actualMessage = helloWorld.sayHello();

        Assert.assertThat(actualMessage, CoreMatchers.is("Hello World"));

    }

}