package com.kishinskiy;

import java.util.*;

public class MyIterator<E> implements Iterator<E> {

    private int index = 0;
    E[] values;

    MyIterator(E[] values){
        this.values = values;
    }


    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values[index++];
    }
}
