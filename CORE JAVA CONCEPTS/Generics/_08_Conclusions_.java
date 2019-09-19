package generics;

import java.util.ArrayList;

/**
 * created by Shivam on 19-09-2019.
 */
public class _08_Conclusions_ {

    public static void main(String[] args) {

        // Communication with non generic area ->
        // If we send generic object to non generic are, it starts behaving as non generic object.
        // If we send non generic object to generic area, then it starts behaving like generic object.

        // The location it which the obj is present, based on that the behaviour will be decided.




        /////////////////////////////////////////////////////////////////////////////////

        // GENERIC Concept is only applicable at COMPILE TIME.
        // After compilation, the generic syntax is removed

        ArrayList list =new ArrayList<String>();

        // After compilation, ArrayList<String>() will be removed.
        list.add("Shivam");
        list.add(78);
        list.add(true);
        // All are valid!!!!!!!!!

        System.out.println(list);   // [Shivam, 78, true]


        // As generic is only applicable at compile time, the compiler will decide the type of AL at compile time based on REFERENCE TYPE.
        // So following declaration are same- >

        ArrayList l = new ArrayList<String>();
        ArrayList l1 = new ArrayList<Integer>();
        ArrayList l2 = new ArrayList<Number>();
        ArrayList l3 = new ArrayList<Thread>();

        // Following are also equal!
        ArrayList<String> l4 = new ArrayList<String>();
        ArrayList<String> l5 = new ArrayList();

    }
}


////////////////////////////////////////////////////////////////

// At compile time following happens ->

//1 Compile code normally by considering generic syntax!
//2 Remove generic syntax!
//3 Compile once again resultant code!

//////////////////////////////////////////////////////////////////////////////



//class Test{
//
//    public void m1(ArrayList<String> l){
//
//    }
//    public void m1(ArrayList<Integer> l){
//
//    }
//
//
//    //At compile time both methods will became same as the generic syntax will be removed by compiler at CT.
//    // So it will give CE: name clash : both methods have same erasure.
//}