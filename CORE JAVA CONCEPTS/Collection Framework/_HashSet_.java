package collection;

import java.util.HashSet;

/**
 * created by Shivam on 16-09-2019.
 */


////////////////   HASH SET //////////////////////////////////////////////////////////////////

    // The internal data structure is Hash Table BUT in LinkedHashSet it is LinkedList + HashTable(LinkedHashSet is basically used for CACHE Based application).
    // The object are stored based on the HashCode of the object.
    // Insertion order is not preserved as data is stored in hash table based on hashcode() BUT in LinkedHashSet the order is preserved!!!!!!!!!!!!!!!!
    // DUPLICATES are NOT ALLOWED.
    // Only 1 null insertion is possible.
    // Most suitable for searching!!

    // Only ArrayList and Vector implements Serializable, Cloneable  and RandomAccess interfaces,
    // remaining classes of collection implements ONLY Serializable and Cloneable!!

    // If we try to add duplicate elements, the add() will return false, No CTE or RTE.

    // DEFAULT CAPACITY of HashSet is 16.
    // The default FILL RATIO(LOAD FACTOR) is 0.75.

    // FILL RATIO ->  In ArrayList, the capacity is increased only when the existing AL object is COMPLETELY FILLED(100% Filled)(10 elements)
                    // But in case of Hash Table related Structures, we can specify when we have to increase the capacity of HashTable.
                    // Fill Ratio .75 means that the capacity of HashSet will be increased when existing HashSet object is filled by 75%.

    // Constructors ->
                    // 1) HS hs=new HS();
                    // 2) HS hs=new HS(int initialCapacity);
                    // 3) HS hs=new HS(int initialCapacity, float fillRatio);
                    // 4) HS hs=new HS(Collection c);
                    // 5) HS hs=new HS(int initialCapacity, float fillRatio);


public class _HashSet_ {

    public static void main(String[] args) {


        HashSet<String> strings =new HashSet<>();

        strings.add("Shivam");
        strings.add("Shukla");
        strings.add("Reyan");
        strings.add("Colt");
        strings.add("No order");
        strings.add(null);
        strings.add("Shivam");    // false



        // As we don't know the hashcode, the can't pretend the order of the elements int the HashSet.
        System.out.println(strings);            //[Reyan, null, Shukla, Shivam, Colt, No order]


    }
}
