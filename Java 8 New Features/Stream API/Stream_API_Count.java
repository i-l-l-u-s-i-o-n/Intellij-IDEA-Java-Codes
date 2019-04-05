package com.shivam;

import java.util.ArrayList;
import java.util.List;

/**
 * created by Shivam on 05-04-2019.
 */

// It returns the no. of objects in collection based on certain condition.
// It returns the long type value.

public class Stream_API_Count {

    public static void main(String[] args) {

        ArrayList<Integer> marks=new ArrayList<>();

        marks.add(95);
        marks.add(100);
        marks.add(25);
        marks.add(31);
        marks.add(80);

        // If we have to get the no. of FAILED students, we can use filter and then count.

        long  noOfFailedStudent=marks.stream().filter(m -> m<33).count();

        System.out.println(noOfFailedStudent);

    }

}
