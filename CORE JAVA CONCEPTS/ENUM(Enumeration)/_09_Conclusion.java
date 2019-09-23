package enumeration;

/**
 * created by Shivam on 24-09-2019.
 */


import static java.lang.Math.sqrt;
import static enumeration.Month.OCT;


enum Languages{

    JAVA,C,CPP,JS,PY;

}

class _09_Conclusion {

    public static void main(String[] args) {

        // All the methods we can apply on normal java objects, are applicable to enum also!

        Languages l1 = Languages.JAVA;
        Languages l2 = Languages.C;

        System.out.println(l1.equals(l2));                      // false
        System.out.println(l1.hashCode()>l2.hashCode());        // false
        System.out.println(l1.compareTo(l2));                   // -1
        // System.out.println(l1>l2);        It will give CTE.

        // We can also call Enum class methods on enum objects.
        System.out.println(l1.ordinal()>l2.ordinal());          // false

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // If we want to use any class or interface directly from outside package then required import is normal import,
        // such as import java.util.*;

        // If we want to access static members without class name then required import is STATIC import.
        // Eg- > import static java.lang.Math.sqrt;
        // This will allow us to use sqrt(num) directly without using Math.sqrt(num);

        System.out.println(sqrt(25.0));     // 5.0

        // Similarly in case of enum, if we use static import to import the enum, then we can directly access the enum
        // constant without using the enum name.


        System.out.println(OCT.ordinal()+1);         // 10


    }
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

enum Color{

    // Here for Color RED, we are overriding the info method using anonymous inner class concept.

    GREEN, RED{
                public void info(){
                    System.out.println("Dangerous color!");
                }
            },
    BLUE;


    public void info(){
        System.out.println("Universal color!");
    }

}

class Main{

    public static void main(String[] args) {


        Color[] colors = Color.values();

        for (Color c: colors) {
            c.info();
        }

        /*

        Universal color!
        Dangerous color!
        Universal color!

        */

    }
}


