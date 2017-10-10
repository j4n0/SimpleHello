package com.example.junit;

import com.example.app.Hello;
import com.example.logger.HelloLogger;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Optional;
import java.util.ServiceLoader;

public class HelloTest extends TestCase
{
    public HelloTest(String testName)
    {
        super(testName);
    }

    public static Test suite()
    {
        return new TestSuite(HelloTest.class);
    }

    public void testHello()
    {
        new Hello();
        assertTrue(true);
    }

    public void testLoadClassWithReflection(){
        try {
            Class<?> clazz = Class.forName("com.example.logger.HelloLogger");
            assertNotNull(clazz.getConstructor().newInstance());
        } catch (ReflectiveOperationException e) {
            fail("Using reflection: HelloLogger not loaded");
        }
    }

    public void testLoadClassWithServiceLoader() {
        // this requires a provides with for HelloLogger, and a uses for HelloTest, otherwise, the return is null
        Optional<HelloLogger> logger = ServiceLoader.load(HelloLogger.class).findFirst();
        assertTrue(logger.isPresent());
    }

    public void testAccessFieldWithReflection(){
        try {
            Field f = HelloLogger.class.getDeclaredField("isEnabled");
            f.setAccessible(true);
        } catch (NoSuchFieldException e) {
            fail("Reflecting private field: " + e.toString());
        }
    }

    public void testAccessMethodWithReflection(){
        try {
            Method m = HelloLogger.class.getDeclaredMethod("_debug", String.class);
            m.setAccessible(true);
            Object target = HelloLogger.class.getConstructor().newInstance();
            m.invoke(target, "");
        } catch (ReflectiveOperationException e) {
            fail("Reflecting private field: " + e.toString());
        }
    }
}
