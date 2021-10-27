package com.company1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Main {

    public static List<String> list = new ArrayList();



    public static void bubblesort(List<String> list){
        for (int j = list.size() - 1; j > 0; --j)
            for (int i = 0; i < j; i++)
                if (Integer.parseInt(list.get(i)) > Integer.parseInt(list.get(i+1))) {
                    Collections.swap(list, i, i+1);
                }
    }

    public static void quicksort(int lewy, int prawy) {

        int i,j;
        String pivot;

        i=(lewy+prawy)/2;
        pivot=list.get(i);
        //System.out.println(pivot);
        //list.set(i,list.get(list.size()));
        Collections.swap(list, i, prawy);
        for(i=j=lewy;i<prawy;i++)
        {
            if(Integer.parseInt(list.get(i))<Integer.parseInt(pivot)) {
                Collections.swap(list, i, j);
                j++;
            }
        }
        Collections.swap(list, prawy, j);
        //for (String temp : list) {
         //   System.out.println(temp);
        //}
        if(lewy<j-1) {
            quicksort( lewy, j - 1);
        }
        if(j+1<prawy) {
            quicksort(j + 1, prawy);
        }

    }




    public static int lol ()
    {
        return 3;
    }

    public static void main(String[] args) {
        // write your code here
        silnia sil = new silnia();
        System.out.println(sil.silnianko(3));
        var name = "Rafal";
        System.out.println("Hello " + name);


        list.add("1");
        list.add("3");
        list.add("2");
        list.add("5");
        list.add("4");
        list.add("28");
        list.add("7");


        //bubble sort
        //bubblesort(list);

        //quicksort
        quicksort(0,list.size()-1);

        for (String temp : list) {
            System.out.println(temp);
        }









    }
}
