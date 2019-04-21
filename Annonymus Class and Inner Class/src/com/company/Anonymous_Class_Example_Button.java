package com.company;

import javax.management.ObjectName;

// Created by Shivam Shukla.

public class Anonymous_Class_Example_Button {

    String title;
    OnCLickListner onCLickListner;

    public Anonymous_Class_Example_Button( String title) {
        this.title = title;
    }

    public void setOnClickListner(OnCLickListner onClickListner){
        this.onCLickListner=onClickListner;
    }

    public void onClick(){
        onCLickListner.click(title);
    }


    //To define click method we can use local class OR ANONYMOUS class as shown in main.

    public interface OnCLickListner{
        void click(String t);
    }
}
