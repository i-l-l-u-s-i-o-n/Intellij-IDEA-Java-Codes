package com.shivam;

/**
 * created by Shivam on 06-02-2019.
 */

public class Main {

    public static void main(String[] args) {

        Student s1=new Student("Shivam",101);
        Student s2=new Student("Shivam",101);
        Student s3=new Student("Shivam",102);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println();

        System.out.println("hashCode() of s1 : "+s1.hashCode());
        System.out.println("hashCode() of s2 : "+s2.hashCode());
        System.out.println("hashCode() of s3 : "+s3.hashCode());

    }
}
