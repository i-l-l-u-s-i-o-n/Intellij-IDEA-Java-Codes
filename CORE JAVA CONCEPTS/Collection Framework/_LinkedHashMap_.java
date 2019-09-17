package collection;

import java.util.LinkedHashMap;

/**
 * created by Shivam on 17-09-2019.
 */

///////////////////////////// LinkedHashMap  ////////////////////////////////////

    // Underlying D.S is LinkedLList + HashTable
    // Insertion order is preserved while in HashMap insertion order os not preserved.
    // It is introduced in 1.4v while HashMap in 1.2v.

    // Else everything is same as HashMap!!!!!!

    // Commonly used for developing CACHE BASED application!


public class _LinkedHashMap_ {

    public static void main(String[] args) {


        // To preserve the insertion order we use LinkedHashMap instead of HashMap.
        LinkedHashMap<String,Integer> employees = new LinkedHashMap<>();

        employees.put("Shivam",101);
        employees.put("Colt",102);
        employees.put("Bruce",103);    // returns null, as key Tom doesn't already exists.
        employees.put("Tom",105);
        employees.put("Venkatesh",106);
        employees.put("Tim",107);
        employees.put("Tom",104);      // returns 103, as it is replace by 104


        System.out.println(employees);    // {Shivam=101, Colt=102, Bruce=103, Tom=104, Venkatesh=106, Tim=107}

    }
}
