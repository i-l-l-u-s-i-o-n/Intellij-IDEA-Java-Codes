package com.shivam;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * created by Shivam on 06-04-2019.
 */


// Min and Max are based on the sorting order.

    // In case of ASCENDING order sorted elements ->

        // Min -> First Element.
        // Max -> Last Element.
        // Eg. [3,4,5,6,7,8,9]
        // min - 3, max- 9

    // In case of DESCENDING order sorted elements ->

        // Min -> First Element.
        // Max -> Last Element.
        // Eg. [9,8,7,6,5,4,3]
        // min - 9, max- 3

// We must have to define the compare method of Comparator interface to define the sorting order.

public class Stream_API_Min_Max {

    public static void main(String[] args) {

        ArrayList<Integer> marks= new ArrayList<>();

        marks.add(90);
        marks.add(92);
        marks.add(33);
        marks.add(90);
        marks.add(23);
        marks.add(55);
        marks.add(99);
        marks.add(96);

        // Defining ascending sorting order for finding min.
        Comparator<Integer>  asc_sort=(i1,i2)->i1.compareTo(i2);
        // Above line can be replaced with Comparator.naturalOrder();
        int min=marks.stream().min(asc_sort).get();
        int max=marks.stream().max(asc_sort).get();

        System.out.println("Min : "+ min+"  Max : "+max);

        // Defining ascending sorting order for finding min.
        Comparator<Integer>  desc_sort=(i1,i2)->-i1.compareTo(i2);
        // Above line can be replaced with Comparator.naturalOrder();
        min=marks.stream().min(desc_sort).get();
        max=marks.stream().max(desc_sort).get();

        System.out.println("Min : "+ min+"  Max : "+max);




    }

}
