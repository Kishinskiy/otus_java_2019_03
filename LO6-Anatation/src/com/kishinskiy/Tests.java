package com.kishinskiy

public class Tests {
    @Before
    public void before() {
        System.out.println("Before Anatation...");
    }

    @Test
    public void test() {

        System.out.println("Test Anatation...");
    }

    @After
    public void after() {
        System.out.printf("After Anatation...");
    }
}


