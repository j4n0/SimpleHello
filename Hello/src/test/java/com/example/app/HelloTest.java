package com.example.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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
        assertTrue( true );
    }
}
