package com.shivam;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * created by Shivam on 06-04-2019.
 */

// forEach(Function) is used to perform some operation on each element of collection.
    // A function is the parameter for forEach().
    // It can be a Consumer instance.

public class Stream_API_ForEach {

    public static void main(String[] args) {

        ArrayList<Integer> marks=new ArrayList<>();

        marks.add(95);
        marks.add(98);
        marks.add(25);
        marks.add(31);
        marks.add(80);

        // This instance will be passed to forEach().
        Consumer<Integer> function= i -> {
            System.out.println("Square of "+i+" is : "+i*i);
        };

        marks.stream().forEach(function);

        // OR

        // We can use double colon  ::
        marks.stream().forEach(System.out::println);

        // OR
        // We can directly pass Consumer instance to forEach() as ->

        marks.stream().forEach( i -> {
            System.out.println("Square root of "+i+" is : "+Math.sqrt((double)i));
        });

    }
}
// OUTPUT ->
/*
Square of 95 is : 9025
Square of 98 is : 9604
Square of 25 is : 625
Square of 31 is : 961
Square of 80 is : 6400
95
98
25
31
80
Square root of 95 is : 9.746794344808963
Square root of 98 is : 9.899494936611665
Square root of 25 is : 5.0
Square root of 31 is : 5.5677643628300215
Square root of 80 is : 8.94427190999916
 */