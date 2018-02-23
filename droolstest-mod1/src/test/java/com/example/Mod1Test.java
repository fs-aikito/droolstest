package com.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class Mod1Test
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public Mod1Test(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( Mod1Test.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testMod1()
    {
        System.out.println("testMod1()");
        assertTrue( true );
    }
}
