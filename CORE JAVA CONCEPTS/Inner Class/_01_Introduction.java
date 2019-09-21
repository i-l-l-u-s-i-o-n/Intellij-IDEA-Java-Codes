package innerClass;

/**
 * created by Shivam on 21-09-2019.
 */
class Outer{


    public static void main(String[] args) {


        // Defining a class inside other class is called inner class.

        // This concept was introduce in 1.1v to fix GUI bugs as a part of Event Handling, but because of powerful features
        // programmers started using in regular coding also!!!!

        // Without existing of one type of object, other object can't exist, for such type of requirement INNER Class concept is used!!!!

        // Examples ->

            // University consist of several departments, without university, there is no existence of Department, So we have to define Department class inside University class!

            // Without existing Car object , engine can't exist , So we can define Engine class inside Car class.

            // There is no chance of Existing Entry( Key value pair)  object without Map object(In MAP in Java ), so Entry interface is defined inside Map interface!!!!!!!!!


        // The relationship between Outer class and Inner class is HAS-A(Composition / Aggregation) relationship , not IS-A relationship!!!!!!!!!!!!!!!!!!!


        /////////////////////////// TYPES OF INNER CLASS ////////////////////////////////////////

        // 1) Normal or Regular Inner Class     -> If we are declaring any NAMED class, directly INSIDE A CLASS, without STATIC modifier, is called NORMAL IC.
        // 2) Method Local Inner class          -> Defined inside a method!
        // 3) Anonymous Inner CLass             -> Inner class without a name!
        // 4) Static nested inner class




        /////// Compiling and executing class containing Inner class.

        // javac Outer.java     It will create 2 .class file->

            // Outer.class
            // Outer$Inner.class           // It indicates that Inner is a INNER CLASS (as it is written after Outer( outer class name) and $ symbol)

        // java Outer                      // To run Outer class.
        // java Outer$Inner                // To run Inner class. ( But actually we can't directly run using Command prompt!!)

        // Inner class can NOT have STATIC declarations(any static member)  i.e. it also can't contain MAIN Method and hence it can't be run directly........

        // Only Outer class can have main method!


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        //  // // // / // //     CASE  -  1 ---- > Accessing inner class code from STATIC AREA (main method of outer class)- >

        // We can only call inner class method only after creating Outer class object!

        Outer out =new Outer();

        // Creating Inner class Object->
        Outer.Inner in = out.new Inner();

        // Calling m1()
        in.m1();


        // We can merge the first 2 line into single line->
        Outer.Inner inn = new Outer().new Inner();

        // We can call the inner class method from a single line->
        new Outer().new Inner().m1();



        //  // // // / // //     CASE  -  2 ---- > Accessing inner class code from NON STATIC AREA (non static methods of outer class)- >

        Outer outt= new Outer();
        outt.m2();                 // Outer object is used to call m2() so in m2() we can directly call Inner class method by creating Inner object!


        //  // // // / // //     CASE  -  3 ---- > Accessing inner class code from OUTSIDE the Outer class ->

        // This case is same as case 1, we have to use outer class object to access Inner class code!!!!



        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // In inner class , we CAN'T define STATIC methods!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////


    }


    public void m2(){

        // We can directly access Inner class here->

        // Because m2 is non static method of Outer class and we must create Outer object to call m2(), so we are using Outer object to call m2() and hence we call m1() of inner.
        Inner i =new Inner();
        i.m1();
    }

    // Inner class
    class Inner {

        public void m1(){
            System.out.println("Inner class method!!!!!!!");
        }

    }

}
