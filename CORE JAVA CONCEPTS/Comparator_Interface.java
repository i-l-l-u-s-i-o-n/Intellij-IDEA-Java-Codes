package com.shivam;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * created by Shivam on 05-04-2019.
 */

// Comparator interface is used to compare 2 objects of any class.
// In collections, sort() uses comparator instance as parameter.


// Comparator interface has SINGLE ABSTRACT METHOD(SAM). i.e compare(obj1, obj2)
// So it is a FUNCTIONAL INTERFACE.
// Hence we can use LAMBDA EXP. for this.

// ==============================================================================================//

// compare(obj1,  obj2) returns ->
    // -ve if  obj1  has to come BEFORE  obj2.
    // +ve if  obj1  has to come AFTER   obj2.
    //  0  if  obj1  &   obj2 are  EQUAL.

// ==============================================================================================//

class Asc_order implements Comparator<Integer>{

    public int compare(Integer i1,Integer i2){
        return i1-i2;            // If i1 is greater than i2,  it will return +ve, which means, i1 has to come after i1.
    }
}

public class Comparator_Interface {

    public static void main(String[] args) {

        ArrayList<Integer> marks=new ArrayList<>();

        marks.add(90);
        marks.add(80);
        marks.add(89);
        marks.add(95);
        marks.add(97);
        marks.add(76);
        marks.add(88);
        marks.add(70);

        // Now in order to call marks.sort(), we must have a class which implements Comparator interface and define compare().
        // And then pass that class's object as a parameter i.e marks.sort(new Class_name);

        marks.sort(new Asc_order());
        System.out.println("MARKS in ASCENDING order : "+marks);

        // OR

        // We can use LAMBDA EXPRESSION to define the compare method.

        Comparator<Integer> desc_order= (i1, i2) -> (i1>i2)? -1 : (i1<i2) ? 1: 0;

        marks.sort(desc_order);
        System.out.println("MARKS in DESCENDING order : "+marks);


    }
}


