package garbageCollection;

import java.util.Date;

/**
 * created by Shivam on 20-09-2019.
 */
public class _02_Methods_for_requesting_JVM_to_run_GC {

    public static void main(String[] args) {

        // We don't know when the JVM will run GC and destroy Objects!!!!!
        // So we can only request JVM to run GC when we want!!!!!!!!!!!!!!

        // There are 2 ways for requesting JVM to run GC.

        //1.) By using System class -> System.gc() can be used to request the JVM to run the GC.
                                        // gc() is a STATIC method of System class.
                                        // It internally calls Runtime.getRuntime().gc();

                                        // SO it is recommended to use directly Runtime class gc().......



        //2.) Using Runtime class -> Runtime is a singleton class. It has several methods ->

        Runtime r= Runtime.getRuntime();

        System.out.println(r.totalMemory());        // Returns the total heap memory in bytes.

        System.out.println(r.freeMemory());        // Returns the free heap memory.


        for (int i = 0; i < 100000; i++) {
            Date d =new Date();
            d=null;   // Making available for GC.
        }

        System.out.println(r.freeMemory());        //   1942215


        // gc() is a instance method of Runtime class as we can only call it after creating object of Runtime class(Getting instance as it is singleton)!
        r.gc();        // requesting to call GC.

        System.out.println(r.freeMemory());        //    953985

        // The less memory is remaining because there is no guarantee that JVM will run GC and also our program will take some memory to execute!!!


    }
}
