package com.example.app;

import algorithms.sort.Sortable;

import java.util.Arrays;
import java.util.Optional;
import java.util.ServiceLoader;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class Hello
{
    private final static Logger LOGGER = Logger.getLogger(Hello.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Hello World!");
        serviceLookup();
        serviceStream();
    }

    public Hello(){}

    private static void serviceLookup(){
        Integer[] values1 = {1,9,7,3};
        ServiceLoader<Sortable> loader = ServiceLoader.load(Sortable.class);
        Sortable sortable = loader.iterator().next();
        sortable.sort(values1);
        System.out.println(Arrays.toString(values1));
    }

    private static void serviceStream(){
        Integer[] values2 = {1,9,7,3};
        Stream<ServiceLoader.Provider<Sortable>> providers = ServiceLoader.load(Sortable.class).stream();
        final Optional<ServiceLoader.Provider<Sortable>> sortable2 = providers.findFirst();
        sortable2.get().get().sort(values2);
        System.out.println(Arrays.toString(values2));
    }
}