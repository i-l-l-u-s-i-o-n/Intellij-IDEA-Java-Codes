package com.company;

// Created by Shivam Shukla.

public class Main {


    public static void main(String[] args) {

        OuterClass out=new OuterClass("Shivam");
        System.out.println(out.getName());


        //This is the way how to access INNER CLASSES :

        OuterClass.Inner inner=out.new Inner("Shivam");
        System.out.println(inner.getNamee());


        //////////////////////////////////////////////////////////////




        // Local class method as the class is declared in a method ->

        Anonymous_Class_Example_Button button=new Anonymous_Class_Example_Button("EXPLORE");

        class listner implements Anonymous_Class_Example_Button.OnCLickListner{

            public listner() {

                System.out.println("\nAction Attached ! ");
            }

            @Override
            public void click(String t) {
                System.out.println(t+" button has been pressed !\n");
            }
        }

        button.setOnClickListner(new listner());
        button.onClick();



        //////////////////////////////////////////////////////////////



        // Anonymous Class METHOD ->

        Anonymous_Class_Example_Button button1=new Anonymous_Class_Example_Button("EXPLORE");
        button1.setOnClickListner(new Anonymous_Class_Example_Button.OnCLickListner() {
            @Override
            public void click(String t) {
                System.out.println(t+" button has been pressed (Anonymous) !");
            }
        });
        button1.onClick();





    }





}
