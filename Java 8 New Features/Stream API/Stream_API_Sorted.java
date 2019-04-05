package com.shivam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * created by Shivam on 05-04-2019.
 */


// SORTED method may also uses Comparator instance as parameter.

    // sorted() ->               natural sorting. As it internally uses COMPARABLE interface which has compareTo()
    //                           it means i1.compareTo(i2).
    //                           So it gives result based on natural sorting.

    // sorted(comparator) ->     sorting based on compare().



// So we have to implement Comparator interface so as to define the compare().

// Comparator interface has SINGLE ABSTRACT METHOD(SAM). i.e compare(obj1, obj2)
// So it is a FUNCTIONAL INTERFACE.
// Hence we can use LAMBDA EXP. for this.

// ==============================================================================================//

// compare(obj1,  obj2) returns ->
// -ve if  obj1  has to come BEFORE  obj2.
// +ve if  obj1  has to come AFTER   obj2.
//  0  if  obj1  &   obj2 are  EQUAL.

// ==============================================================================================//

public class Stream_API_Sorted {


    public static void main(String[] args) {
        ArrayList<Integer> marks=new ArrayList<>();

        marks.add(95);
        marks.add(100);
        marks.add(60);
        marks.add(65);
        marks.add(88);
        marks.add(60);
        marks.add(76);

        // If we do not pass any comparator instance in sorted(), it will sort in natural sorting order.
        List<Integer> ASC_Ordered_marks=marks.stream().sorted().collect(Collectors.toList());

        // It can be also considered as ->
        // List<Integer> ASC_Ordered_marks=marks.stream().sorted( (i1,i2)-> i1.compareTo(i2) ).collect(Collectors.toList());
        System.out.println("Marks in ascending order : "+ASC_Ordered_marks);


        Comparator<Integer> descending_comparator=(i1,i2) -> i1>i2 ? -1 : i1<i2? 1: 0;


        // If we pass our own comparator instance then it will sort as per compare() definition.
        List<Integer> DESC_Ordered_marks=marks.stream().sorted(descending_comparator).collect(Collectors.toList());

        // OR

        // It can also be written as ->
        // List<Integer> DESC_Ordered_marks=marks.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
        // OR
        // List<Integer> DESC_Ordered_marks=marks.stream().sorted((i1,i2) -> i2.compareTo(i1)).collect(Collectors.toList());



        System.out.println("Marks in descending order : "+DESC_Ordered_marks);



        ///// ==========================================   EXAMPLE 2   ======================================   ///////

        ArrayList<String> name=new ArrayList<>();

        name.add("Shivam Shukla");
        name.add("SHIVAM SHUKLA");
        name.add("Andrew Russell");
        name.add("Tim Buchalka");
        name.add("Colt Steele");

        // Naturally sorted name(alphabetically).

        List<String> naturally_sorted_names=name.stream().sorted().collect(Collectors.toList());
        System.out.println("Naturally Sorted Names: "+naturally_sorted_names);





        // Sorted in reverse order.

        List<String> reverse_sorted_names=name.stream().sorted((n1,n2)-> - n1.compareTo(n2)).collect(Collectors.toList());
        System.out.println("Reverse Sorted Names: "+reverse_sorted_names);





        // Sorting based on length of names.

        // we have to define compare() of Comparator interface for customised sorting.
        Comparator<String> sorting_based_on_length=(n1, n2) -> {
                                                                    if (n1.length()>n2.length()){
                                                                        return 1;
                                                                    }else if (n1.length()<n2.length()){
                                                                        return -1;
                                                                    }return n1.compareTo(n2);
                                                                 };


        List<String> length_based_sorting=name.stream().sorted(sorting_based_on_length).collect(Collectors.toList());
        System.out.println("Length based sorting : "+length_based_sorting);




    }
}
// OUTPUT ->

/*
Marks in ascending order : [60, 60, 65, 76, 88, 95, 100]
Marks in descending order : [100, 95, 88, 76, 65, 60, 60]
Naturally Sorted Names: [Andrew Russell, Colt Steele, SHIVAM SHUKLA, Shivam Shukla, Tim Buchalka]
Reverse Sorted Names: [Tim Buchalka, Shivam Shukla, SHIVAM SHUKLA, Colt Steele, Andrew Russell]
Length based sorting : [Colt Steele, Tim Buchalka, SHIVAM SHUKLA, Shivam Shukla, Andrew Russell]
 */