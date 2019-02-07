package com.shivam;


import java.lang.reflect.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Student s= new Student("Shivam",101);

        Class class_name=s.getClass();
        System.out.println("Class : "+class_name.getName());


        // For Method we must import java.lang.reflect.*;
        Method[] declared_methods=class_name.getDeclaredMethods();

        System.out.println("Declared Methods : ");
        for (Method m:declared_methods){
            System.out.println(m);
        }

        System.out.println(declared_methods.length);

        Constructor<Student> constructor=class_name.getConstructor(String.class, int.class);

        System.out.println("\nConstructor defined in Student class : \n");
        System.out.println(constructor);

    }
}
