package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * created by Shivam on 18-09-2019.
 */

// // //// // / / // //////////    COLLECTIONS CLASS  /// // // / //////////// // / // /


    // Collections is a UTILITY CLASS which defines some utility methods for Collection Objects, like sorting, searching, reversing etc.

    // Example -> if we want to store the elements in Al, but we also wants the elements to be sorted, so we can use->
                    // Collections.sort(AL object);

    // Methods ->

            // public static void sort(List l);  -> sorts the elements of List, based on natural sorting order, but List should NOT contain NULL, else it will give NPE.
            // public static void sort(List l, Comparator c);  -> For Customised sorting.


public class _Collections_ {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        list.add("f");
        list.add("e");

        System.out.println(list);       // [b, c, d, a, f, e]

        // Sorting
        Collections.sort(list);


        System.out.println(list);       // [a, b, c, d, e, f]


        // For customised sorting we have to pass comparator object to the sort method.
        Comparator<String> reverseOrder = (s1,s2 )-> -s1.compareTo(s2) ;

        // Sorting in reverse order
        Collections.sort(list,reverseOrder);

        System.out.println(list);       // [f, e, d, c, b, a]

    }
}
