package com.example.junit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.example.app.Hello;

public class HelloTest extends TestCase
{
    public HelloTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( HelloTest.class );
    }

    public void testHello()
    {
        new Hello();
        assertTrue( true );
    }
}
