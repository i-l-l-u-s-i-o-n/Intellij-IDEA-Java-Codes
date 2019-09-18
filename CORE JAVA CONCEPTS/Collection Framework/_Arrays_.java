package collection;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * created by Shivam on 18-09-2019.
 */




/////////// /////////////// ///      ARRAYS CLASS     ///// ////// // // /////

    // It is a utility class.
    // It define several utility methods for Arrays.
    // Following are some utilities->


        // Arrays.toString(array); -> To return string representation of array .

        // Sorting->

            // public static void sort(primitive[] p);  uses QUICK SORT. Sorting based on Default Natural Sorting Order(DNSO)
            // public static void sort(Object[] o);     uses MERGE SORT. Sorting based on Default Natural Sorting Order(DNSO)
            // public static void sort(Object[] o, Comparator c);  uses MERGE SORT. Sorting based on Customised Sorting Order.

        // Searching->

            // public static int binarySearch(primitive[] p, primitive target);
            // public static int binarySearch(Object[] o, Object target);
            // public static int binarySearch(Object[] o, Object target, Comparator c);

            // All rules of Arrays.binarySearch() are same as Collections.binarySearch()!!

        // Conversion of Array to List ->
            // public static List asList(Object[] o);  This method won't create an independent List object. For existing Array we are getting List view.
                                                        // Hence named asList() not toList(). Both List and Array refer to the single object!!!!
            // *********** By using Array reference, if we perform any change, it will be reflected to the List!!!!!! *********** //
            // *********** Similarly if we make change using List reference, change will be reflected to Array!!!!!!! *********** //
            // Using List reference, we can't perform the operation, which CHANGES THE SIZE OF ARRAY...... Otherwise we will get UnsupportedOperation Exception!!!!!!!
            // list.add() is NOT ALLOWED while list.set(0,"ss") or list.remove("n").... are allowed...






public class _Arrays_ {

    public static void main(String[] args) {

        int []a ={5,2,1,3,4};

        // Sorting primitive array->
        Arrays.sort(a);

        System.out.println(Arrays.toString(a));     // [1, 2, 3, 4, 5]


        String []s= {"b","d","a","e","c"};

        //Sorting Object array with DNSO.
        Arrays.sort(s);

        System.out.println(Arrays.toString(s));     // [a, b, c, d, e]


        Comparator<String> customSortingOrder= Comparator.reverseOrder();  // OR (s1,s2) -> s2.compareTo(s1);


        // Sorting Object array with Customised sorting order.
        Arrays.sort(s,customSortingOrder);

        System.out.println(Arrays.toString(s));     // [e, d, c, b, a]

        System.out.println(Arrays.binarySearch(s,"h",customSortingOrder)); // -1  i.e it means h must be inserted at index 0.  If result = -2, it means the element should be inserted at index 1 ....
        System.out.println(Arrays.binarySearch(s,"e",customSortingOrder)); // 0


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        List<String> list= Arrays.asList(s);

        list.set(2,"cc");   // replacing c with cc and will reflect in array s also!!

//        list.add("f"); //Not allowed as Array size is fixed and we are trying to increase the array size!!!!!!!!

        System.out.println(list);               // [e, d, cc, b, a]

        System.out.println(Arrays.toString(s)); // [e, d, cc, b, a]

        s[2]="c";  // It will also reflect change in list.

        System.out.println(Arrays.toString(s)); // [e, d, c, b, a]

        System.out.println(list);               // [e, d, c, b, a]

    }
}
