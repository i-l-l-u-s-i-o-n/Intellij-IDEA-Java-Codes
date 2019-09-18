package collection;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 * created by Shivam on 18-09-2019.
 */


// It provide some functions which allows us to navigate over the set or Map.

    // Navigable Concept came in 1.6v.

    // Example - > Suppose there is Time chart for flights at airport and we want the first flight. So for this we can use first() od SortedSet.
                // Similarly if we want flight before 10:00, we can use headSet(10).
                // BUT if we want the flight time just before 10:00, then there is no such direct method.
                // TO to fill this gap, NavigableSet and Map came into picture from 1.6v.

    //////////////////////////////////////   NAVIGABLE SET  //////////////////////////////////////////////////////////////
    // Methods ->

        // floor(e) -> returns highest element which is <=e
        // lower(e) -> returns highest element which is <e        (the flights which is just before 10:00 -> lower(10))
        // ceiling(e) -> returns lowest which is >=e
        // higher(e) -> returns lowest which is >e.
        // pollFirst() -> remove and return first element.
        // pollLast() -> remove and return last element.
        // descendingSet() -> returns NavigableSet in reverse order.


    // TreeSet class implements NavigableSet interface.

    //////////////////////////////////////   NAVIGABLE MAP  //////////////////////////////////////////////////////////////

    // NavigableMap define following Methods ->

        // floorKey(e);
        // lowerKey(e);
        // ceilingKey(e);
        // higherKey(e);
        // pollFirstEntry()
        // pollLastEntry()
        // descendingMap()

    // TreeMap is the class which implements NavigableMap.






public class _NavigableSet_and_NavigableMap_ {


    public static void main(String[] args) {

        TreeSet<Integer> integers =new TreeSet<>();

        for (int i = 1000; i <=10000 ; i+=1000) {
            integers.add(i);
        }


        System.out.println(integers);                          // [1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000]
        System.out.println(integers.floor(4000));           // 4000
        System.out.println(integers.lower(4000));           // 3000
        System.out.println(integers.ceiling(4000));         // 4000
        System.out.println(integers.higher(4000));          // 5000
        System.out.println(integers.pollFirst());              // 1000
        System.out.println(integers.pollLast());               // 10000
        System.out.println(integers.descendingSet());          // [9000, 8000, 7000, 6000, 5000, 4000, 3000, 2000]
        System.out.println(integers);                          // [2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000]




        ///////////////////////////////////////////////////////////////////////////////////

        TreeMap<String , Integer > map= new TreeMap<>();

        int j=97;
        for (int i = 0; i <= 10; i++,j++) {
            map.put((char)j +"",i);
        }

        System.out.println(map);                            // {a=0, b=1, c=2, d=3, e=4, f=5, g=6, h=7, i=8, j=9, k=10}
        System.out.println(map.lowerKey("e"));              // d
        System.out.println(map.floorKey("e"));              // e
        System.out.println(map.ceilingKey("e"));            // e
        System.out.println(map.higherKey("e"));             // f
        System.out.println(map.pollFirstEntry());           // a=0
        System.out.println(map.pollLastEntry());            // k=10
        System.out.println(map.descendingMap());            // {j=9, i=8, h=7, g=6, f=5, e=4, d=3, c=2, b=1}
        System.out.println(map);                            // {b=1, c=2, d=3, e=4, f=5, g=6, h=7, i=8, j=9}


    }
}
