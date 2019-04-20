package com.kishinskiy;

import java.util.*;

public class Main {

//    // create array list object
//    List arrlist = new ArrayList();
//
//    // populate the list
//      arrlist.add("A");
//      arrlist.add("B");
//      arrlist.add("C");
//
//      System.out.println("Initial collection value: "+arrlist);
//
//    // add values to this collection
//    boolean b = Collections.addAll(arrlist, "1","2","3");
//
//      System.out.println("Final collection value: "+arrlist);
//}


//    // create two lists
//    List<String> srclst = new ArrayList<String>(5);
//    List<String> destlst = new ArrayList<String>(10);
//
//    // populate two lists
//      srclst.add("Java");
//      srclst.add("is");
//      srclst.add("best");
//
//      destlst.add("C++");
//      destlst.add("is");
//      destlst.add("older");
//
//    // copy into dest list
//      Collections.copy(destlst, srclst);
//
//      System.out.println("Value of source list: "+srclst);
//      System.out.println("Value of destination list: "+destlst);


    public static void main(String[] args) {

        List arrlist = new MyArray<>();

        arrlist.add("A");
        arrlist.add("B");
        arrlist.add("C");



            System.out.println("String Values: " + arrlist);

        System.out.println("String Values: " + arrlist);

        boolean b = Collections.addAll(arrlist, "1", "2", "3");

        System.out.println("Complete Values: " + arrlist);


            // create two lists
    List<String> srclst = new MyArray<String>(5);
    List<String> destlst = new MyArray<String>(10);

    // populate two lists
      srclst.add("Java");
      srclst.add("is");
      srclst.add("best");

      destlst.add("C++");
      destlst.add("is");
      destlst.add("older");

    // copy into dest list
      Collections.copy(destlst, srclst);

      System.out.println("Value of source list: "+srclst);
      System.out.println("Value of destination list: "+destlst);


    }





}
