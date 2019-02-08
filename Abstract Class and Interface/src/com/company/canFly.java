package com.company;

public interface canFly {

    //The variable fields are ALWAYS STATIC and FINAL as interface can't be instantiated.
    //                  BUT
    // IN abstract class fields can be NON-STATIC and NON_FINAL

    String name1="k";

    // All methods are automatically PUBLIC and ABSTRACT.
    void fly();


    //Interface can have private method from java9
    private void show(){
        //
    }



}
