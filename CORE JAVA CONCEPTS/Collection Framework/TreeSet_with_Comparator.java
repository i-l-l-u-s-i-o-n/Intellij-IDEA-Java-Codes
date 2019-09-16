package collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * created by Shivam on 16-09-2019.
 */


// To provide customised sorting, we implement Comparator interface.

    // It contains 2 methods ->
        //1) int compare(Object o1, Object o2);
        //2) boolean equals(Object o) ;

    // We need to provide implementation only for compare(), not for equals() as our class which will implement Comparator
    // is also the the child of Object class, so equals() is already available to it.!!!!!

    // compare(obj1,  obj2) returns ->
        // -ve if  obj1  has to come BEFORE  obj2.
        // +ve if  obj1  has to come AFTER   obj2.
        //  0  if  obj1  &   obj2 are  EQUAL.



// EXAMPLE 1-> So sort the INTEGERS in DESCENDING order.


    // Since the Integer class already implements Comparable, and we want some customised sorting we ca go for Comparator.
class ReverseOrder implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {

        Integer i1= (Integer)o1;
        Integer i2= (Integer)o2;

        // as i1.compareTo(i2) sorts the Number in ascending order.
        // SO we can return -1 instead of +1 and so on to reverse the order.
        return -i1.compareTo(i2);    // OR we can do i2.compareTo(i1);


        // return 1;  // It will always return +1 and the elements will be inserted in the same order as entered.....
        // return -1; // Elements will be stored in reverse of insertion order.
        // return 0;  // Only first element will be inserted and all the element will be considered as duplicate.

    }
}



// In case of pre defined non comparable class, we use Comparator to define sorting order.
class ReverseStringBufferElements implements Comparator<StringBuffer>{

    @Override
    public int compare(StringBuffer o1, StringBuffer o2) {

        return o2.toString().compareTo(o1.toString());
    }
}


// In case of user defined classes if we are writing the class then we should define the natural sorting order using COMPARABLE.
// But if we are using a user defined class and are not satisfied with the natural sorting order then we can go for Comparator interface.

class Employee implements Comparable{

    String name;
    int eid;

    public Employee(String name, int eid) {
        this.name = name;
        this.eid = eid;
    }

    @Override
    public String toString() {
        return this.name + " -- "+this.eid;
    }

    @Override
    public int compareTo(Object o) {

        Employee e1= (Employee)o;


        // Sorting based on eid.
        if (this.eid<e1.eid){
            return -1;
        }else if(this.eid> e1.eid) {
            return +1;
        }else
            return 0;

    }
}


// Here we are creating a class to define the sorting order based on names of employees.

class SortingBasedOnNames implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}



public class TreeSet_with_Comparator {

    public static void main(String[] args) {


        TreeSet<Integer> integers = new TreeSet<Integer>(new ReverseOrder());

        integers.add(100);
        integers.add(101);
        integers.add(102);
        integers.add(103);
        integers.add(104);
        integers.add(105);
        integers.add(106);
        integers.add(107);
        integers.add(108);
        integers.add(109);

        System.out.println(integers);    // [109, 108, 107, 106, 105, 104, 103, 102, 101, 100]


        TreeSet<StringBuffer> stringBuffers = new TreeSet<>(new ReverseStringBufferElements());

        stringBuffers.add(new StringBuffer("SHIVAM"));
        stringBuffers.add(new StringBuffer("ANDREW"));
        stringBuffers.add(new StringBuffer("shivam"));
        stringBuffers.add(new StringBuffer("COLT"));
        stringBuffers.add(new StringBuffer("tim"));

        // Elements sorted in reverse order.
        System.out.println(stringBuffers);  //[tim, shivam, SHIVAM, COLT, ANDREW]


        // As employee class already implemented Comparable.
        TreeSet<Employee> employees = new TreeSet<>();

        employees.add(new Employee("Shivam",101));
        employees.add(new Employee("Lisa",103));
        employees.add(new Employee("Bruce",105));
        employees.add(new Employee("Robin",102));
        employees.add(new Employee("John",104));

        System.out.println(employees);  //[Shivam -- 101, Robin -- 102, Lisa -- 103, John -- 104, Bruce -- 105]


        // But now suppose we are using the Employee class and are not satisfied with the default sorting order then
        // we can use a class which implements Comparator to define the customised sorting order and pass it in TreeSet Constructor.


        // Here we are sorting the employees based on Employee name.

        TreeSet<Employee> employees1 = new TreeSet<>(new SortingBasedOnNames());

        employees1.addAll(employees);

        System.out.println(employees1);   //[Bruce -- 105, John -- 104, Lisa -- 103, Robin -- 102, Shivam -- 101]


    }
}
