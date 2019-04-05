package com.shivam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * created by Shivam on 05-04-2019.
 */

// MAP is used to perform some type of operation on the collection objects.
public class Stream_API_Map {

    public static void main(String[] args) {

        ArrayList<Integer> marks=new ArrayList<>();

        marks.add(10);
        marks.add(10);
        marks.add(15);
        marks.add(20);
        marks.add(25);
        marks.add(30);

        // Suppose we have to add 5 marks in all the objects.

        //We can do it in a single line using stream().map().collect()

        //                                         Adding 5 mark
        //                                              ^^
        //                                              ||
        List<Integer> updatedMarks=marks.stream().map(i -> i+5).collect(Collectors.toList());
        System.out.println(updatedMarks);


    }

}
