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

            // public static int binarySearch(List l, Object o)  ->> The list MUST be SORTED else we'll get unpredictable result. If the element exists, it returns the index of that element.
                                                            // else it returns the INSERTION POINT, where the element can be inserted.
                                                            // Insertion point is the index which starts from -1(index 0), -2 (index 1), -3,-4......

            // public static int binarySearch(List l, Object o, Comparator c)  ->> If the list is sorted using comparator c,then we MUST pass the same comparator to the method.


            // BINARY SEARCH ---->>>> In case of binarySearch(), the range of the result for n elements ->
                                        // Successful result range = 0 to n-1
                                        // Unsuccessful result range = -(n+1) to -1
                                        // Total result range = -(n+1) to n-1

            // public static void reverse(List l)  - > To reverse elements of a list!


            // public static Comparator reverseOrder(Comparator c); -> It returns the reversed Comparator object. Let if c sorts the elements in ascending order of number then returned comparator will sort in descending order!!




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

        // Before sorting, if we apply Binary Search, the result will be unpredictable!!!!
        System.out.println(Collections.binarySearch(list,"d"));     // 2


        // Sorting
        Collections.sort(list);


        System.out.println(list);       // [a, b, c, d, e, f]

        //Searching
        System.out.println(Collections.binarySearch(list,"d"));     // 3
        System.out.println(Collections.binarySearch(list,"g"));     // -7


        // For customised sorting we have to pass comparator object to the sort method.
        Comparator<String> reverseOrder = (s1,s2 )-> -s1.compareTo(s2) ;


        // Before sorting, if we apply Binary Search, the result will be unpredictable!!!!
        System.out.println(Collections.binarySearch(list,"d",reverseOrder));    // -1


        // Sorting in reverse order
        Collections.sort(list,reverseOrder);

        System.out.println(list);       // [f, e, d, c, b, a]


        // Searching of the element which is sorted by customised sorting order.
        System.out.println(Collections.binarySearch(list,"d",reverseOrder));    // 2
        System.out.println(Collections.binarySearch(list,"g",reverseOrder));    // -1


        // If we apply binary search on the elements that are NOT sorted using default natural sorting order( sorted using Customised sorting order)
        // the we must pass the comparator object to BinarySearch else the result will be unpredictable!
        System.out.println(Collections.binarySearch(list,"g"));    // -7


        // Reversing
        Collections.reverse(list);

        System.out.println(list);     // [a, b, c, d, e, f]


        // ReversedOrder comparator ->
        Comparator comparator = Collections.reverseOrder(reverseOrder);



    }
}
