package com.shivam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * created by Shivam on 06-04-2019.
 */

// toArray() is used to CONVERT the STREAM OF OBJECTS INTO ARRAY.
public class Stream_API_ToArray {

    public static void main(String[] args) {

        ArrayList<Integer> marks=new ArrayList<>();

        marks.add(94);
        marks.add(100);
        marks.add(68);
        marks.add(65);
        marks.add(88);
        marks.add(60);
        marks.add(76);



        // Here Integer[]:: new returns a new object for Integer[].
        Integer arr[]=marks.stream().toArray(Integer[]::new);

        for (Integer i: arr){
            System.out.println(i);
        }


        // We can also convert array to Stream of objects and various stream methods can be applied.

        Stream.of(arr).forEach( i -> System.out.println(i));

    }

}
