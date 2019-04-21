package com.company;

// Created by Shivam Shukla.

public class OuterClass {
    String name;
    Inner inner;

    public OuterClass(String name) {
        this.name = "Hello";
        inner=new Inner(name);

    }


    public String getName(){
        return name+" "+inner.getNamee();
    }



    public class Inner{
        String namee;

        public Inner(String namee) {
            this.namee = namee;
        }

        public String getNamee(){
            return namee;
        }
    }

}
