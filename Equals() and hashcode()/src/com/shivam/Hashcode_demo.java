package com.shivam;

/**
 * created by Shivam on 03-02-2019.
 */

class Student_detail {
    String name;
    int roll_no;

    Student_detail(String n, int r){
        roll_no=r;
        name=n;
    }


    // Overriding is called proper if we generate unique hashcode for every object. else called improper.
//    @Override
//    public int hashCode() {
//        return roll_no;
//    }


}

public class Hashcode_demo {
    public static void main(String[] args) {
        Student_detail s1 = new Student_detail("Shivam", 9);
        Student_detail s2 = new Student_detail("Shivam", 10);
        Student_detail s3 = new Student_detail("Shivam", 102);



        // Object class toString() returns ->
        // return getClass().getName()+"@"+Integer.toHexString(hashCode());
        // So it internally calls hashCode() of object class if we didn't override hashcode()

        // Object class hashcode () generate a number based on address of object int hexadecimal form.
        // It is actually not the address of object.
        // If we override it we can also generate any number free from address.
        // Hashcode() is used by JVM for storing data in DATA structure that uses HASHING.
        // It makes SEARCHING VERY EASY

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        //Before overriding output was ->
//        com.shivam.Student_detail@1c53fd30
////        com.shivam.Student_detail@50cbc42f
////        com.shivam.Student_detail@75412c2f



        //After overriding hashcode output->
//        com.shivam.Student_detail@9
//        com.shivam.Student_detail@a
//        com.shivam.Student_detail@66



    }

}
