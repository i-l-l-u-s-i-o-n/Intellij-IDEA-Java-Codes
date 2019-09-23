package enumeration;

/**
 * created by Shivam on 23-09-2019.
 */

// If we want to define group of named constants under a single name, then we should go for Enum.
// Using Enum, we can create our own data types with allowed values.

// Example -> here we are creating Month dataType with allowed values as -> JAN,FEB,MAR ......, DEC.

    // Every enum is always implicitly FINAL, but we can't declare it explicitly is FINAL.
enum Month{
    JAN,FEB,MAR,APR,MAY,JUN,JULY,AUG,SEP,OCT,NOV,DEC;   // ; is optional at the end!


}

// The main objective of ENUM is to define own data types(Enumerated data types(EDT)).
// Enum in java was introduced in 1.5v

// Java Enum is more powerful as compared to old languages ENUM, as it can ALSO CONTAIN METHODS, INNER CLASSES, Variables etc.

// The internal implementation of Enum is like a class->
    // i.e every ENUM constant is the OBJECT of the Type Enum.
    // ( JAN is the Object of Month enum) !

// Every Enum constant is PUBLIC STATIC and FINAL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

// The class representation of Enum will be like ->
class Month_{

    public  static final Month_ JAN = new Month_();
    public  static final Month_ FEB = new Month_();
    // and so on.....

}

public class _01_Introduction {

    // ENUM can be declared inside the class or outside the class BUT NOT inside a method, as the Method Local inner class
    // can't have Static members, and Every constant in enum is public, static, final!

    // If enum is define Outside class, modifiers applicable -> public, strictfp, default
    // If enum is define Inside class, modifiers applicable -> public, strictfp, default, private, protected, static.


    public static void main(String[] args) {

       // How to use Enum constants?
        // As every Enum constant is public static and Final, and the Object of the Enum type,sp ->

        Month m= Month.OCT;

        // In Enum, the toString() is overridden to return the NAME of enum Constant.
        System.out.println(m);              // OCT


    }
}
