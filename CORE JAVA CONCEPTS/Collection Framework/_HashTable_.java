package collection;

import java.util.Hashtable;
import java.util.Objects;

/**
 * created by Shivam on 17-09-2019.
 */


// ////// //// ///// HASH TABLE ///// /////// /////// //////

    // Underlying Data Structure is HashTable.

    // Insertion order is not preserved.

    // Insertion order depends on HASHCODE OF KEYS.

    // Keys can't be Duplicated.

    // Values can be Duplicated.

    // KEYS and VALUES CAN'T be NULL !!!!!!!!!!!!!

    // Every method present in HashTable is synchronised so it is Thread Safe!!!!!!!

    // Best choice if SEARCHING is our most frequent operation.

// Constructors ->

    // HT ht = new HT();                 // default initial capacity is 11, Fill ratio is 0.75
    // HT ht = new HT(int initialCapacity);
    // HT ht = new HT(int initialCapacity, float fillRatio);
    // HT ht = new HT(Map m);


public class _HashTable_ {


    public static void main(String[] args) {

        // Initially in the Hashtable, there are 11 BUCKETS (as initial capacity is 11).
        // As the Elements are stored based on hashCode, so it is recommended to override the EQUALS() and HASHCODE() methods
        // to sore the same Objects in the SAME BUCKET.

        // See the overridden definition of HashCode in Temp class.
        // If we know the hashCode, we can pretend the order of insertion of elements.

        Hashtable<Temp_,Integer> tempIntegerHashtable = new Hashtable<>();

//        new Temp_(5); --> Hashcode will be 5 as we are returning the value of i.

        tempIntegerHashtable.put(new Temp_(78),1);      // 78 % 11 = 1 , So this will be sored in BUCKET 1(index 1).
        tempIntegerHashtable.put(new Temp_(78),1);      // since 78 == 78 , keys are matched, so the will be ignored.
        tempIntegerHashtable.put(new Temp_(3),32);       // Stored in bucket 3.
        tempIntegerHashtable.put(new Temp_(0),13);      // Stored in bucket 0.
        tempIntegerHashtable.put(new Temp_(2),14);      // Stored in bucket 2.
        tempIntegerHashtable.put(new Temp_(5),15);      // Stored in bucket 5.
        tempIntegerHashtable.put(new Temp_(21),2);      // 21 % 11 = 10 , So stored in Bucket 10.
        tempIntegerHashtable.put(new Temp_(32),34);     // 32 % 11 = 10 , So stored in bucket 10, after {21=2}( as 21 is already there)

        // By seeing the LAST 2 Entries, we can say that a bucket may contain 2 different objects also.

        // The printing order will be ->

            // From TOP to BOTTOM
                // From RIGHT to LEFT ( if there are more than 1 element in a bucket.)

        System.out.println(tempIntegerHashtable);
        // {i : 32=34, i : 21=2, i : 5=15, i : 3=32, i : 2=14, i : 78=1, i : 0=13}
        // The 0the index value will be printed at last because the indexing of Hashtable is as follows ->
        /*
       INDEX   Key=Value

        10 |   {21 = 2} , {32 = 34}
         9 |
         8 |
         7 |
         6 |
         5 |    {5 = 15}
         4 |
         3 |    {3 = 32}
         2 |    {2 = 14}
         1 |    {78 = 1}
         0 |    {0 = 13}


         */

    }
}


class Temp_ {

    int i;

    public Temp_(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "i : "+i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Temp_)) return false;
        Temp_ temp_ = (Temp_) o;
        return i == temp_.i;
    }

    @Override
    public int hashCode() {
        return this.i;
    }
}
