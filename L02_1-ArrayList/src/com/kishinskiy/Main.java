package com.kishinskiy;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    private static void fillarray(List arrlist) {
        for (char c = 'a'; c <= 'z'; ++c) {

            arrlist.add(c);
        }
    }


    public static void main(String[] args) {

        //////  вызываем addAll /////
        List arrlist = new MyArray<>();

        fillarray(arrlist);

        boolean b = Collections.addAll(arrlist, "1", "2", "3"); // с этим вроде бы все понятно.
        System.out.println(arrlist.size());

        ////////////////////////////////////////
        ///////   copy ////////

        // create two lists
        try {
            List<String> srclst = new MyArray<String>(5);
            List<String> destlst = new MyArray<String>(10);

            fillarray(srclst);
            fillarray(destlst);

            Collections.copy(destlst, srclst);  // java.lang.NullPointerException  почему, не понимаю

            System.out.println("Value of source list: " + srclst);
            System.out.println("Value of destination list: " + destlst);


        } catch (NullPointerException e) {
            System.out.println("Ошибка при копировании эллементов массива");
        }
        //////////////////////////////////////

        //// Sort /////
        MyArray<Integer> list = new MyArray<Integer>();

        // заполняем список из 20 элементов случайными числами
        for (int i = 0; i < 20; i++) {
            int random = (int) (Math.random() * 50 + 1);

            list.add(random);
        }

        // вызываем метод Sort для этого списка.
        Collections.sort(list);  // с этим тоже все ясно

        for (int i : list) {
            System.out.println(i + " ");
        }
        //////////////////////////////////
    }

}
