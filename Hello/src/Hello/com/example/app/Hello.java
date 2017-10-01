package com.example.app;

import algorithms.sort.Sortable;

import java.util.Arrays;
import java.util.ServiceLoader;
import java.util.logging.Logger;

public class Hello
{
    private final static Logger LOGGER = Logger.getLogger(Hello.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Hello World!");
        Integer[] values = {1,9,7,3};

        Class<Sortable> clazz = null;
        try {
            clazz = (Class<Sortable>) Class.forName("algorithms.sort.Sortable");
            ServiceLoader<Sortable> loader = ServiceLoader.load(clazz);
            Sortable sortable = loader.iterator().next();
            sortable.sort(values);
            System.out.println(Arrays.toString(values));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public Hello(){}
}