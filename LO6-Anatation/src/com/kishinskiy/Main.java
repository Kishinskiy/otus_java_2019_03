package com.kishinskiy;

public class Main {

    public static void main(String[] args){
        Arrays.stream(Tests.class.getMethods()).forEach(method -> {
            if ( method.isAnnotationPresent(Annotation.class)) {
                System.out.println("Anatation found");
            }
        });
    }
}
