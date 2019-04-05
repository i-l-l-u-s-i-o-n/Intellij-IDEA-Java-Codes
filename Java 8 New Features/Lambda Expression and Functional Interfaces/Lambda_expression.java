package com.shivam;

/**
 * created by Shivam on 04-04-2019.
 */

// To enable functional programming feature in JAVA, Lambda was introduced in it.

// It is just a anonymous function i.e. the function without name , return type, modifiers .

//  These are also called CLOSURES.
public class Lambda_expression {

    public static void main(String[] args) {

        /*
        =======================================================
        Eg1.

        public void print(){
            System.out.println("Lambda");
        }

        It's lambda exp. will be ->

        ()-> {  System.out.println("Lambda"); }

        ~ If there is only one statement in method body, then we can remove {};

        i.e
        ()->   System.out.println("Lambda");


        =======================================================

        Eg2.


        public void sum(int a, int b){
            System.out.println(a+b);
        }

        (int a,int b) -> System.out.println(a+b);

        ~ We can also remove the type of parameter.
        ( a,b) -> System.out.println(a+b);

        =======================================================
        Eg3.

        public int sqr(int n){
            return n*n;
        }

        (n) -> return n*n;

        ~ If there is only 1 statement, so we can remove return .
        ~ If there is only 1 parameter , then we can remove ().

        i.e

        n -> n*n;

         */




        //=======================================================================================================//
        //              Actually how we call or invoke the LAMBDA exp                                            //
        //                                                                                                       //
        //    Ans. Functional Interfaces. If we have have functional interface, then only we can use Lambda exp. //
        //=======================================================================================================//


    }


}
