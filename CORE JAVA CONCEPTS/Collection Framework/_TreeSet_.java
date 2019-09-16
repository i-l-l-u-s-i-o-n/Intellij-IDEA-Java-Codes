package collection;

import java.util.TreeSet;

/**
 * created by Shivam on 16-09-2019.
 */



    // TreeSet is the class which implements the SortedSet Interface.

    // SortedSet interface define following 6 methods ->
        // 1) Object first();   // Returns first element of SortedSet
        // 2) object last();    // returns last element.
        // 3) SortedSet headSet(Object obj)   // return sortedSet whose elements are less than the obj.
        // 4) SortedSet tailSet(Object obj)   // return sortedSet whose elements are greater than OR EQUAL to the obj.
        // 5) SortedSet subSet(Object o1, Object o2) ; // return SortedSet whose elements >= o1 AND  < o2.
        // 6) Comparator comparator();    // returns Comparator object that describes underlying sorting technique.If we are
                                          // using default natural sorting order then we will get null.


    // The default natural sorting order for NUMBER -> ASCENDING ORDER.
                                        //   STRING -> ALPHABETICAL ORDER.


    // TreeSet properties->

        // Internal Data Structure is BALANCED TREE!!!!!!!
        // Duplicates NOT allowed.
        // NULL Insertion ->
                    // If TS is empty, we can insert null.
                    // After inserting null, if we try to add more elements, it will give null pointer exception!!
                    // If the TS contains some elements and we try to insert null, we get NPE(null pointer exception).
                    // From v1.7, null is NOT ALLOWED EVEN as a FIRST ELEMENT.
        // Insertion order not preserved(as sorted)
        // Sorted elements.

    // Constructors ->
        // TS t= new TS();   // All objects will be inserted using default natural order.
        // TS t= new TS(Comparator c);   // For customised sorting in case of user defined objects.
        // TS t= new TS(Collection c);
        // TS t= new TS(SortedSet s);
public class _TreeSet_ {

    public static void main(String[] args) {

        TreeSet<Integer> integers = new TreeSet<>();

        integers.add(100);
        integers.add(101);
        integers.add(102);
        integers.add(103);
        integers.add(104);
        integers.add(105);
        integers.add(106);
        integers.add(107);
        integers.add(108);
        integers.add(109);

        System.out.println(integers);                                //[100, 101, 102, 103, 104, 105, 106, 107, 108, 109]
        System.out.println(integers.first());                       //100
        System.out.println(integers.last());                       //109
        System.out.println(integers.headSet(105));      //[100, 101, 102, 103, 104]
        System.out.println(integers.tailSet(105));   //[105, 106, 107, 108, 109]
        System.out.println(integers.subSet(100,105));          //[100, 101, 102, 103, 104]


        //---------------------------------------------------------//
        // ----The objects must be HOMOGENEOUS and COMPARABLE-----//
        //--------------------------------------------------------//

        // If we use String, then we can simply use first constructor.
        // All WRAPPER class and String class already implements Comparable!
        // BUT if we use StringBuffer, we will get a class cast exception as it doesn't implement Comparable.
        // So in case of user defined classes, we must implement Comparable Interface to define natural sorting order.

        // While adding elements to tree set, JVM will call compareTo() of Comparable interface for natural sorting order.

        // If default natural sorting order is not available by Comparable , the we can go for CUSTOMISED SORTING ORDER using COMPARATOR Interface.


        TreeSet<String> strings = new TreeSet<>();

        strings.add("SHIVAM");
        strings.add("Shivam");  // "Shivam".compareTo("SHIVAM") -> returns +1 so "Shivam" will come after "SHIVAM"
        strings.add("ShiVAm");
        strings.add("sHIVAM");
        strings.add("shivam");
        strings.add("sh");


        // a > A  as 97 > 65 (unicode value)
        System.out.println(strings);  //[SHIVAM, ShiVAm, Shivam, sHIVAM, sh, shivam]



    }
}
