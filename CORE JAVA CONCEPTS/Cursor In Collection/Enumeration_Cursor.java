package collection;

import java.util.Enumeration;
import java.util.Vector;

/**
 * created by Shivam on 16-09-2019.
 */


// If we want to get objects one by one from the collection then we should go for Cursor.

    // There are 3 types of Cursor ->

    // 1.) Enumeration
    // 2.) Iterator
    // 3.) ListIterator


class Main {

    public static void main(String[] args) {


// 1.) Enumeration ->
                            // We can get the Enumeration object by calling .elements() on the Vector object.
                            // Only applicable to Vector!!!!!!!!!!
                            // It came in 1.0v so it is a Legacy Element.
                            // It is not a universal cursor as t can be only used with Vector!!
                            // It can only provide READ access and we can't remove elements!!!!

        Vector<Integer> integers = new Vector<>();

        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }

        // Getting Enumeration Object.
        Enumeration enumeration=integers.elements();

        // Iterating over elements.
        while (enumeration.hasMoreElements()){

            // Getting next element.
            Integer i= (Integer)enumeration.nextElement();
            if (i%2==0){
                System.out.println(i);
            }
        }

        System.out.println(integers);

    }
}

/*

0
2
4
6
8
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

 */
