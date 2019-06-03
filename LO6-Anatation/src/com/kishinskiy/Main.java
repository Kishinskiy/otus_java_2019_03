package com.kishinskiy;

public class Main {

    @Before
    public void before(){
        System.out.println("Before Anatation...");
    }

    @Test
    public void test (){

        System.out.println("Test Anatation...");
    }

    @After
    public void after(){
        System.out.printf("After Anatation...");
    }

    public static void main(String[] args){


        System.out.println("Test!");
    }
}
