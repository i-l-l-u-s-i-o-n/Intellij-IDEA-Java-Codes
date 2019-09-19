package generics;

import java.util.ArrayList;

/**
 * created by Shivam on 19-09-2019.
 */






public class _04_Generic_Classes {

    public static void main(String[] args) {


        // Without generic the AL class was declared as ->


            // class AL{
            //      add(Object o){....}
            //      Object get(int index){....}
            // }


        // From 1.5v, the generic class is declared as follows ->

        // class AL<T>                          Here T -> Type Parameter.
        //      add(T object){.....}            Type Safety is ensured!
        //      T get(int index){.....}         Type Casting is not required at time of retrieval.
        // }

        ArrayList<String> strings = new ArrayList<>();

        // Here the T (Type Parameter) will be replaced by String.

        // In generics, we are associating Type Parameter with class. Such type of classes are called GENERIC CLass.
        // Generics concept also is applicable for user defined classes!!!!!

        // Example ->

        Generic_Class<Integer> integer =new Generic_Class<>(78);
        integer.show();  // Object : 78
                         //  Class : java.lang.Integer


        Generic_Class<String> string =new Generic_Class<>("SHIVAM");
        string.show();    // Object : SHIVAM
                          // Class : java.lang.String


    }
}

class Generic_Class<T>{

    T object;

    public Generic_Class(T object) {
        this.object = object;
    }

    public void show(){
        System.out.println("Object : "+object+"\nClass : "+object.getClass().getName());
    }

}