package generics;

import java.util.ArrayList;

/**
 * created by Shivam on 19-09-2019.
 */
//////////////////////////////////////    WILDCARDS ( ? )   //////////////////////////////////////////////////////////


// If there is a method  ->  m1(AL<String> list){    }
    // Eg- list.add("Shivam"); // valid
    //     list.add(10);       // Invalid

    // It will take only ArrayList of Strings as a argument!!!!!!!!!

    // With WILD-CARDS ( ? )  , we can allow the method to take any Type of Argument!!!!!!

    // Following are some valid definitions ->

        // m1( AL<?> list );            // It can take AL of any type.
        // m1( AL< ? extends Number);   // It can take Al of Number type ior its child type objects.
        // m1( AL< ? super Number);     // It is also valid in case of Wild cards. It will take Al which has object of Super class of Number.
                                        // If x is interface then we can call this method by passing AL of type x of its implementation class's super class.

    // The advantage is that we do not have to create separate methods for every type.
    // Just is single method can be used to for different type of AL.

    // The disadvantage is that we can now call m1() , we can pass only null because we don't know the type of the required Object. Null is acceptable for all object.

    // This type of methods are best suitable for READ ONLY operation.


    ///////////////////////////////////////////////////////////////////////////

    // AL <String> s =new AL<String>();   valid
    // Al < ? > a =new AL<String> ();     valid
    // Al < ? > a =new AL<Integer> ();     valid
    // Al < ? extends Number > a =new AL<Integer> ();       valid
    // Al < ? extends Number > a =new AL<String> ();        Invalid
    // Al < ? super String > a =new AL<Object> ();          valid
    // Al < ? > a =new AL< ? > ();                          Invalid
    // Al < ? > a =new AL< ? extends Number>();             Invalid

class _06__Wild_Card_Character {

    public static void main(String[] args) {


//        <?> is allowed only in the declaration side, right hand side the class or iterface is expected
        ArrayList<?> list = new ArrayList<String>();

//        ArrayList< ? >  list = new ArrayList< ? >();   Not valid

        ArrayList<? extends  Number> numbers= new ArrayList<Integer>();   //Valid
//        ArrayList<? extends  Number> numbers1= new ArrayList<String>();   //InValid

    }
}
