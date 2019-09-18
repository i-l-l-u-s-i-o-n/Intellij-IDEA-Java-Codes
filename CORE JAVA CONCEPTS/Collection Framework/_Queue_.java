package collection;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * created by Shivam on 18-09-2019.
 */


/// / // / / // / / //  ///     QUEUE  Interface / /// / // / / // / // / // / //

    // It is child interface of Collection interface.

    // If we want to represent objects prior to processing then we should go for queue.
    // Eg. -> Before sending SMS we have to store M.No in some Data Structure. The order in which the numbers are stored, in same order the message should be delivered!
    // For FIRST IN FIRST OUT Queue is best choice.
    // It follows FIFO but based on our requirement we can implement our own priority order also.(Priority Queue)
    // From 1.5v onwards, LinkedList also implements QUEUE interface.

    // LinkedList based implementation of Queue always follows FIFO.


    // Queue Interface Methods ->

        // boolean offer(Object o);                 // To add an object to Queue.
        // Object peek();                           // To return head(first) element of the queue.If queue is empty, it returns NULL.
        // Object element();                        // Returns head element but if queue is empty, it gives RE: NoSuchElementException.
        // Object poll();                           // To remove and return head element. If empty, returns NULL.
        // Object remove();                         // Remove and returns head element. If empty, gives RE : NoSuchElementException


    // It has 2 Implementation Classes ->

        // 1.) PriorityQueue ->
                        // Used to represent group of objects prior to processing according to some priority.
                        // Priority can be based on Default natural sorting order or customised sorting.
                        // Insertion order is not preserved.
                        // Duplicates not allowed.
                        // null is not allowed even as the first element also.

                        // Constructors -> 5
                                // PQ p = new PQ();                      // default initial capacity = 11.
                                // PQ p = new PQ(int initialCapacity);
                                // PQ p = new PQ(int initialCapacity, Comparator c);
                                // PQ p = new PQ(Collection c);
                                // PQ p = new PQ(SortedSet s);

        // 2.) Blocking Queue ->
                        // i) PriorityBlockingQueue
                        // ii) LinkedBlockingQueue

public class _Queue_ {

    public static void main(String[] args) {

        PriorityQueue<Integer> integers = new PriorityQueue<>();

        System.out.println(integers.poll());    // null
//        System.out.println(integers.remove());  // Give RE: NoSuchElementFound

        for (int i=0;i<=10;i++){
            integers.offer(i);              // By default, Elements are inserted as per default natural sorting order.
        }

        System.out.println(integers);       //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println(integers.peek());  // 0
        System.out.println(integers.poll());  // 0
        System.out.println(integers);       // [1, 3, 2, 7, 4, 5, 6, 10, 8, 9]              Here the order is not expected because some OS doesn't provide support for priorities.


        // Using LAMBDA to define Comparator(We can also simply create class to define customised sorting)
        Comparator<Integer> reverseOreder= (i1,i2) -> { return -i1.compareTo(i2); };

        PriorityQueue<Integer> reverseIntegers = new PriorityQueue<>(reverseOreder);

        reverseIntegers.addAll(integers);

        System.out.println(reverseIntegers); // [10, 9, 6, 7, 8, 2, 5, 1, 4, 3]
    }
}
