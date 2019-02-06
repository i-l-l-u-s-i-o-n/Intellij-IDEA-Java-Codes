package com.shivam;

import org.jetbrains.annotations.Contract;

/**
 * created by Shivam on 03-02-2019.
 */

// By default, Object class equals() is referred for reference comparision .
// For String class and wrapper class ,it is overridden for content comparision.
// In StringBuilder it is not overridden for content comparision so it compare reference .
// == is used for primitives(int ,float...) and for reference comparision.
// We should also override hashCode() when we override equals() so as to
// keep the hashCode same for the SAME OBJECTS!!


class Student{

    String name;
    int roll_no;

    Student(String name,int roll_no){
        this.name=name;
        this.roll_no=roll_no;
    }


    public boolean equals(Object obj){
        if (obj==this)  // Checking if reference is same then no need of comparision
            return true;
        if (obj instanceof Student){ // return false if obj is null or of different class object.
            if (name.equals(((Student) obj).name) && roll_no==((Student) obj).roll_no){
                return true;
            }
            return false;
        }
        return false;
    }


}
public class Equals_demo {

    public static void main(String[] args) {


        Student s1 = new Student("S", 101);
        Student s2 = new Student("R", 102);
        Student s3 = new Student("S", 101);
        Student s4 = s1;

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));

        System.out.println(s1.equals("S"));
        System.out.println(s1.equals(null));


//        Before overriding ,OUTPUT was
//        false
//        false
//        true
//        false
//        false


//        After overriding ,OUTPUT is
//        false
//        true
//        true
//        false
//        false


        System.out.println();
        System.out.println();
        String s1_1=new String("shivam");
        String s1_2=new String("shivam");

        System.out.println("For STRING->");
        System.out.println(s1_1==s1_2);
        System.out.println(s1_1.equals(s1_2));
        //Output->
//        false
//        true

        System.out.println();

        StringBuilder sb1=new StringBuilder("shivam");
        StringBuilder sb2=new StringBuilder("shivam");

        System.out.println("For STRINGBUILDER->");
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));
        //Output->
//        false
//        false

        // Here the output differs because String class already overridden equals() for content comparision BUT
        // StringBuilder class didn't already overridden equals() for content comparision , so it compare the reference .
        // To make it compare content , we have to override it.




    }


}
