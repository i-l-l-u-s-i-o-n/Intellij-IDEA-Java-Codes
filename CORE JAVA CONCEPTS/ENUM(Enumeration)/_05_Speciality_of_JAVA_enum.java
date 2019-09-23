package enumeration;

/**
 * created by Shivam on 23-09-2019.
 */


// In java enum, methods, inner classes, normal variables can also be defined in addition to the Integral constants.



    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // We can also define MAIN method inside enum and DIRECTLY RUN enum from command prompt!!!!!!!!!!!!!
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Example ->

enum Laptops{

    PREDATOR, ALIENWARE, ROG, NITRO ;       // Here ; is MANDATORY because ware defining extra stuff other than constants!

    // The CONSTANTS MUST be the FIRST LINE and End with ; , if we are defining any extra member inside enum.


    // Declaring main method inside enum is valid!
    public static void main(String[] args) {

        System.out.println("This main is defined inside enum!");


        // Now to run this,
        // javac laptops.java
        // java Laptop

        // Output ->  This main is defined inside enum!
    }
}


// Empty enum is also valid in java!
enum EmptyEnum{

    // Nothing here!

}

