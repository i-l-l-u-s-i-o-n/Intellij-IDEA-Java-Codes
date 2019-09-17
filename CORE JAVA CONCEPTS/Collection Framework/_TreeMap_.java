package collection;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * created by Shivam on 17-09-2019.
 */


// TreeMap implements SortedMap.

    // It has methods whose functionality is similar to TreeSet(Only basic concept is same).
    // Such as firstKey(), lastKey(), headMap(), tailMap(), subMap(), comparator() .........

    // Underlying data structure is RED - BLACK TREE.
    // Insertion order is not preserve.
    // Sorted elements based on KEYS.
    // Duplicate keys are not allowed but values can be duplicated.
    // If we are depending on default natural sorting order then keys should be homogeneous and comparable else we'll get CCE.
    // If we define our own sorting by Comparator, then keys need not to be homogeneous and comparable.

// NULL Acceptance ->
    // If we are trying to insert a key as null only at the beginning when TreeMap is empty, then only null insertion as a key is possible.
    // If we try to insert a non - null key after inserting first entry with key = null, then we'll get NPE.
    // Similarly if we try to insert a null key after inserting some non null key then also we'll get NPE as the insertion
    // is based on some sorting order and we are comparing an object with null so we'll get NULL POINTER EXCEPTION!!!!!
    // Null insertion is only allowed till i.6v, from 1.7v null insertion is not possible in both TreeSet and TreeMap.

// Constructors -> 4 Constructors, same as TreeSet.


public class _TreeMap_ {

    public static void main(String[] args) {


        //////////////////// EXAMPLE 1 (Default natural sorting order) /////////////////////////////////////////

        TreeMap<String,Integer> employees= new TreeMap<>();

        employees.put("Shivam",101);
        employees.put("Tim",102);
        employees.put("Rob",103);
        employees.put("Henry",104);
        employees.put("Colt",105);

//        employees.put(null,0);   // NPE!

        // Sorting based on default natural sorting order of Strings (Alphabetically)
        System.out.println(employees);          //{Colt=105, Henry=104, Rob=103, Shivam=101, Tim=102}


        ////////////////// EXAMPLE 2 (Using Comparable to define natural sorting for Employee_ class ///////////////

        TreeMap<Employee_,Integer>  employeeIntegerTreeMap = new TreeMap<>();

        employeeIntegerTreeMap.put(new Employee_("Shivam",101),1);
        employeeIntegerTreeMap.put(new Employee_("Henry",105),5);
        employeeIntegerTreeMap.put(new Employee_("Colt",104),4);
        employeeIntegerTreeMap.put(new Employee_("Tim",102),2);
        employeeIntegerTreeMap.put(new Employee_("Rob",103),3);

        System.out.println(employeeIntegerTreeMap);

        //{Name : Shivam   E_ID : 101=1, Name : Tim   E_ID : 102=2, Name : Rob   E_ID : 103=3, Name : Colt   E_ID : 104=4, Name : Henry   E_ID : 105=5}


        ///////////////// EXAMPLE 3 (Sorting using Comparator) //////////////////////////////////////////////////

        TreeMap<Integer,Integer> reverseIntegerMap= new TreeMap<>(new IntegerReverseSortingOrder());

        reverseIntegerMap.put(new Integer(78),1);
        reverseIntegerMap.put(new Integer(60),3);
        reverseIntegerMap.put(new Integer(44),5);
        reverseIntegerMap.put(new Integer(53),2);
        reverseIntegerMap.put(new Integer(72),4);
        reverseIntegerMap.put(new Integer(66),6);

        System.out.println(reverseIntegerMap);   // {78=1, 72=4, 66=6, 60=3, 53=2, 44=5}


    }
}

class Employee_ implements Comparable{

    String name;
    int e_id;

    public Employee_(String name, int e_id) {
        this.name = name;
        this.e_id = e_id;
    }

    @Override
    public int compareTo(Object o) {

        // Sorting based on e_id.
        return this.e_id-((Employee_)o).e_id;

        //return name.compareTo(((Employee_)o).name);
    }

    @Override
    public String toString() {
        return "Name : " + name+"   E_ID : "+e_id;
    }
}


class IntegerReverseSortingOrder implements Comparator{


    @Override
    public int compare(Object o1, Object o2) {

        Integer i1=(Integer)o1;
        Integer i2=(Integer)o2;

        return -i1.compareTo(i2);
    }
}