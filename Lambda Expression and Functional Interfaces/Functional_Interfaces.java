package com.shivam;

/**
 * created by Shivam on 04-04-2019.
 */


// The interfaces, which have SINGLE ABSTRACT METHOD(SAM) is called FUNCTIONAL INTERFACE.
// Functional interface can also have have Default or static methods, but ONLY 1 ABSTRACT method.

// @FunctionalInterface ensures that a interface is Functional .
// If it contains more than 1 abstract methods, it causes compilation error.

@FunctionalInterface
interface A{
    public abstract void m1();
}

@FunctionalInterface
interface B extends A{

}

@FunctionalInterface
interface C extends A{
    void m1();
}

// It is not a functional Interface.
//@FunctionalInterface
//interface D extends A{
//    void m2();
//}


//Since there is only one abstract method, so it is Functional Interface
@FunctionalInterface
interface E{
    void m2();
    default void m3(){

    }
    static void m4(){

    }
}
public class Functional_Interfaces {
}
