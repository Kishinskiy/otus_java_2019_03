package com.kishinskiy;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //////  вызываем addAll /////

        List arrlist = new MyArray<>();


        arrlist.add("A");
        arrlist.add("B");
        arrlist.add("C");


        System.out.println("String Values: " + arrlist);

        System.out.println("String Values: " + arrlist);

        boolean b = Collections.addAll(arrlist, "1", "2", "3"); // с этим вроде бы все понятно.

        System.out.println("Complete Values: " + arrlist);

        ////////////////////////////////////////


        ///////   copy ////////

        // create two lists
        try {
            List<String> srclst = new MyArray<String>(5);
            List<String> destlst = new MyArray<String>(10);

            srclst.add("Java");
            srclst.add("is");
            srclst.add("best");

            destlst.add("C++");
            destlst.add("is");
            destlst.add("older");

            Collections.copy(destlst, srclst);  // java.lang.NullPointerException  почему, не понимаю

            System.out.println("Value of source list: " + srclst);
            System.out.println("Value of destination list: " + destlst);


        } catch (NullPointerException e) {
            System.out.println("Ошибка при копировании эллементов массива");
            //////////////////////////////////////


            //// Sort /////
            MyArray<Integer> list = new MyArray<Integer>();
            list.add(-28);
            list.add(20);
            list.add(-12);
            list.add(8);

            Collections.sort(list, null);  // с этим тоже все ясно

            System.out.println("List sorted in natural order: ");

            for (int i : list) {
                System.out.println(i + " ");
            }
            //////////////////////////////////
        }

    }
}
