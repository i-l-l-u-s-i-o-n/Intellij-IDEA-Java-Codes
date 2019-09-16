package collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * created by Shivam on 16-09-2019.
 */


// If we want to get objects one by one from the collection then we should go for Cursor.

// There are 3 types of Cursor ->

// 1.) Enumeration
// 2.) Iterator
// 3.) ListIterator


public class Iterator_Cursor {

    public static void main(String[] args) {

        // 2.) Iterator->
                // To overcome the problems of the Enumeration, Iterator comes into picture!!
                // It is applicable to any Collection object and hence it is UNIVERSAL CURSOR.
                // We can perform both read and remove operation!!!!!!!!
                // The Iterator object can be created using .iterator() on collection object.
                // It's limitation is that it can only move in FORWARD direction, not in reverse!!
                // To overcome this problem, we can use ListIterator but it also has certain limitations!!


        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }

        Iterator<Integer> iterator =integers.iterator();

        // Following are the methods in Iterator interface->
        while (iterator.hasNext()){

            Integer i = iterator.next();

            if (i%2!=0)
                System.out.println(i);

            else
                iterator.remove();
        }

        System.out.println(integers);

    }
}

/*

1
3
5
7
9
[1, 3, 5, 7, 9]

 */
