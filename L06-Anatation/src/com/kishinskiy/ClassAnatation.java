package com.kishinskiy;

public class ClassAnatation {

    @Target(value= ElementType.METHOD)
    @Retention(value= RetentionPolicy.RUNTIME)
    public @interface Before {

    }


    @Target(value= ElementType.METHOD)
    @Retention(value= RetentionPolicy.RUNTIME)
    public @interface Test {

    }


    @Target(value= ElementType.METHOD)
    @Retention(value= RetentionPolicy.RUNTIME)
    public @interface After {

    }

}
