package com.shivam;

/**
 * created by Shivam on 06-02-2019.
 */
public class Student {

    String name;
    int roll_no;

    Student(String name,int roll_no){
        this.name=name;
        this.roll_no=roll_no;
    }

    public boolean equals(Object o){
        if (this==o)
            return true;
        Student s=(Student)o;
        if (s instanceof Student){
            if (s.name.equals(name) && roll_no==s.roll_no){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }


    // Objects that are equal by .equal() should have same hashCode().
    public int hashCode(){
        return  name.hashCode()+roll_no;
    }

}
