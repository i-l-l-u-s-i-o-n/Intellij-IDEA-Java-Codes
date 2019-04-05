package com.shivam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * created by Shivam on 05-04-2019.
 */

// If we want to represent a group of object as a single entity, we go for Collections.
// If we want to process the elements of Collection , the we use Stream.
// c.stream()
// It is in java.util.stream package


// FILTER is used to perform some type of filter on the collection objects.
public class Stream_API_Filter {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);

        // If we have to get only even numbers in the list then,
        // First we get the stream of objects using list.stream()
        // Second we filter the even elements by passing a PREDICATE to filter(predicate).
        // Third, we will collect the elements after filtering, to a list using .collect(Collectors.toList()) method.

        List<Integer> even_list=list.stream().filter(i -> i%2==0 ).collect(Collectors.toList());
        System.out.println(even_list);
    }
}
