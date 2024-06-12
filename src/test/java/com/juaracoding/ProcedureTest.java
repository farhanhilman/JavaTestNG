package com.juaracoding;

import org.testng.annotations.*;

public class ProcedureTest {

    //Anotation TestNG
    @BeforeClass
    public void setUp() {
        System.out.println("Before Class (Open Browser)");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method (inisiasi)");
    }

    @Test
    public void testOne() {
        System.out.println("Test One");
    }

    @Test
    public void testTwo() {
        System.out.println("Test Two");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method (Screenshoot)");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class (Close Browser)");
    }

}
