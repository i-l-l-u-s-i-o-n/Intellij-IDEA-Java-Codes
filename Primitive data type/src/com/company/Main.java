package com.company;

public class Main {

    public static void main(String[] args) {

        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean


        // String is NOT a primitive data type
        // it's a collection of char

        String myString="This is a string";
        System.out.println(myString);

        myString=myString+" This is appended string";
        myString =myString+" \u00A5 unicode";

        System.out.println(myString);

        String numString="345.65";
        numString=numString+"100.50";
        System.out.println(numString);

        float floatValue=455.323f; //It is necessary to add f at last for the float value or We can do as follows.
        System.out.println(floatValue);
        Float float_Value=new Float(344.54);
        System.out.println(float_Value);
        double double_value=43544.343;
        System.out.println(double_value);

        String string="10";
        int num=50;
        string=string+num;
        System.out.println(string);
        double doubleNum=453345.6544d;
        string=string+doubleNum;
        System.out.println(string);



    }
}
