package generics;

import java.util.ArrayList;

/**
 * created by Shivam on 19-09-2019.
 */



////////////////////////////    GENERICS ////////////////////////


    // The main aim of Generics is to provide TYPE - SAFETY and resolve TYPE - CASTING problems!!

    // Array is type safe while Collections are not type safe.

    // Generics came in v1.5

public class _01_Introduction {

    public static void main(String[] args) {

        String[] s =new String[5];

        s[0]="Shivam";


        // s[1]=new Integer(78);      Not allowed in case of array!

        // So arrays are type safe.


        // Type casting is not required!
        String s1= s[0];


        ArrayList list=new ArrayList();

        list.add("Shivam");
        list.add(new Integer(78)); // Perfectly fine as Collection are not Type Safe!!!!


        // Type casting is required as it is not type safe. we can store heterogeneous elements!
        String s2= (String)list.get(0);


        // To overcome above problems of Collection, sun people introduced generics in 1.5v


    }
}
