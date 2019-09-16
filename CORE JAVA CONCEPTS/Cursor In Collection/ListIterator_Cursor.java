package collection;

import java.util.ListIterator;
import java.util.Stack;

/**
 * created by Shivam on 16-09-2019.
 */


// If we want to get objects one by one from the collection then we should go for Cursor.

// There are 3 types of Cursor ->

// 1.) Enumeration
// 2.) Iterator
// 3.) ListIterator
public class ListIterator_Cursor {

    public static void main(String[] args) {


        // 3.) ListIterator ->
                // It can be used ONLY with LIST objects!!
                // It can traverse in BOTH directions(forward as well as backward).
                // It can READ, ADD, REMOVE and REPLACE the elements while TRAVERSING!!!!!

        // Forward movement operation ->
                // i)   boolean hasNext();
                // ii)  Object next();
                // iii) int nextIndex();

        // Backward movement operation ->
                // i)   boolean hasPrevious();
                // ii)  Object previous();
                // iii) int previousIndex();

        // Extra operation ->
                // i)   void remove();
                // ii)  void add(Object o);
                // iii) void set(Object o);


        Stack<Integer> integers =new Stack<>();

        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }

        // Getting ListIterator objects.
        ListIterator<Integer> listIterator = integers.listIterator();



        //Iterating over elements
        while (listIterator.hasNext()){

            Integer i =listIterator.next();
            if (i==5){
                listIterator.set(500);     // Replacing 5 by 500.
            }

            else if(i==9){
                listIterator.remove();
            }
            else if(i==7){
                System.out.println("Got 7 :) ");
            }
        }

        System.out.println(integers);

    }
}

/*

Got 7 :)
[0, 1, 2, 3, 4, 500, 6, 7, 8]

 */
