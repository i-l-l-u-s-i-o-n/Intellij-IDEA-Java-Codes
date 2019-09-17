package collection;

import java.util.*;

/**
 * created by Shivam on 17-09-2019.
 */



// HashMap class implements Map interface.
    // Map interface doesn't implement Collection interface.
    // It is used o represent KEY-VALUE pairs.

    // Each key value pair is called Entry.
    // So Map interface has an inner interface named Entry.


    // Some methods ->
        // Object put(Object key, Object value) -> return null in case of no duplicate key is inserted.
                                    // When a duplicate key along with the value is inserted, the old value will be replaced by the new value.
                                    // and it returns the old value or replaced value for the key.( NO DUPLICATE KEYS ARE ALLOWED so the value is replaced ).


        // void putAll(Map m);
        // Object get(Object key);
        // Object remove(Object key);
        // boolean containsKey(Object key);
        // boolean containsValue(Object value);
        // boolean isEmpty();
        // int size();
        // void clear();

    // Collection views of Map -> (as they return Collection object)
        // Set keySet();
        // Collection values();
        // Set entrySet();

    // Entry Interface methods -> (Applicable on entry interface object)
        // Object getKeys();
        // Object getValue();
        // Object setValue(Object newObject);


    //////////////////// HASH MAP /////////////////////////////

        // Underlying data structure is HashTable.
        // Duplicate keys are NOT allowed.
        // Duplicate values are allowed.
        // Elements are stored based on their HashCode, so insertion order is not preserved.
        // null key only ONCE, but many null values!
        // Best choice if our frequent operation is search operation!

    // Constructors -> 4 constructors, same as HshSet.

public class _HashMap_ {

    public static void main(String[] args) {


        HashMap<String,Integer> employees = new HashMap<>();

        employees.put("Shivam",101);
        employees.put("Colt",102);
        employees.put("Bruce",103);    // returns null, as key Tom doesn't already exists.
        employees.put("Tom",105);
        employees.put("Venkatesh",106);
        employees.put("Tim",107);
        employees.put("Tom",104);      // returns 103, as it is replace by 104


        System.out.println(employees);   //{Bruce=103, Shivam=101, Tom=104, Colt=102, Tim=107, Venkatesh=106}

        // Getting keys from the map.
        Set names= employees.keySet();

        System.out.println(names);      // [Bruce, Shivam, Tom, Colt, Tim, Venkatesh]

        // Getting values from the Map
        Collection<Integer> e_id= employees.values();

        System.out.println(e_id);      // [103, 101, 104, 102, 107, 106]

        // Getting entry set .
        Set map_entries= employees.entrySet();

        System.out.println(map_entries);   // [Bruce=103, Shivam=101, Tom=104, Colt=102, Tim=107, Venkatesh=106]


        // Iterating over entries of Map.
        Iterator iterator = map_entries.iterator();

        while(iterator.hasNext()){

            Map.Entry<String,Integer> entry = (Map.Entry)iterator.next();
            System.out.println("Key : "+ entry.getKey() + "    Value : "+ entry.getValue());
            if (entry.getKey().equals("Tom")){
                entry.setValue(1044);
            }

        }

        /*
        Key : Bruce         Value : 103
        Key : Shivam        Value : 101
        Key : Tom           Value : 104
        Key : Colt          Value : 102
        Key : Tim           Value : 107
        Key : Venkatesh    Value : 106
         */



    }

}
