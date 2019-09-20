package garbageCollection;

/**
 * created by Shivam on 20-09-2019.
 */
public class _04_Memory_Leaks {

    public static void main(String[] args) {

        // MEMORY LEAKS ->

                // Suppose there are 1 million objects the programmer created but he is using only 100 object.
                // Now all the the objects have some reference and ARE NOT ELIGIBLE for GC.
                // BUT there is memory problem because of 1 million objects , so JVM will call GC, but GC can't do anything as there is no eligible object.

                // Such type of USELESS object, which are not used by programmer and also NOT ELIGIBLE for GC are called Memory Leaks!!!!!!!!!


        // Due to Memory Leaks, the program will be TERMINATED by rising the OutOfMemoryError!!!!!!!!!!!!!

        // Hence if object no longer required, it is highly recommended to make it eligible for GC.


        // There are some 3rd party Memory Management tools which can show the memory leaks ->
            // HP OVO
            // HP J Meter
            // JProbe
            // Patrol
            // IBM Tivoli

    }
}
