package com.example.app;

import java.util.logging.Logger;

public class Hello
{
    private final static Logger LOGGER = Logger.getLogger(Hello.class.getName());
    public static void main(String[] args) {
        LOGGER.info("Hello World!");
    }
    public Hello(){}
}