package garbageCollection;

/**
 * created by Shivam on 20-09-2019.
 */


public class _01_Making_Objects_eligible_for_GC {

    static String s;

    public static void main(String[] args) {


// Garbage collection is the process of destroying the useless objects.

        // In java,the programmer need not to destroy the objects manually.
        // All of this is taken care by GC.

        // Garbage collector doesn't destroy all the objects, it only destroys the useless objects.
        // So it the the job of programmer to make Objects eligible for GC.

        // An object is said to be eligible for GC, if and only if it DOESN'T contain any REFERENCE VARIABLE!!!!!!!

        // Following are some ways ->

        //1.) Nullifying Reference variable -> If object is not required, then assign null to all it's reference

        String s1 = new String("Shivam");
        String s2 = new String("78");

            // No object is available for GC.
            // Now assign s1 and s2 null.

        s1=s2=null;

        // Now 2 objects("Shivam", "78"), eligible for GC.

        // 2.)Reassigning the reference variable -> If obj is no longer required, then reassign it's reference variable,
                                                    // and hence the old object will be available for GC.

        String s3 = new String("Shivam");
        String s4 = new String("78");

        // No object is available for GC.

        s3 = new String("Shukla");
        s4 = new String("01");

        // Now 2 old objects are available for GC.


        // 3.) The objects defined inside a method will implicitly be available for GC when the method completes it's execution!!!!!

        m1();
        // Now the objects defined inside m1() will be available for GC.

        // If a method returns some object and we are holding that object, then it will not be available for GC.
        String s5 =m2();             // Only one object of m2() will be eligible for GC.

        m2(); // Since we are not holding the returned object, both object of m2 are eligible for GC.
        // The static object will not be available for GC.


        // 4.) Island of ISOLATION ->  // Even though obj having references, it is eligible for GC(If all references are internal references.)

        Test t1 =new Test();
        Test t2 =new Test();
        Test t3 =new Test();

        // No obj is available for GC.

        t1.i=t2;
        t2.i=t3;
        t3.i=t1;

        // No obj is available for GC.

        t1=null;

        // No obj is available for GC.

        t2= null;
        // No obj is available for GC.

        t3= null;

        // All (t1,t2,t3) objects are available for GC!!!!!!!!!!!!!!!!!!!!!
    }


    public static void m1(){

        String s1 = new String("Shivam");
        String s2 = new String("78");

        // If we do not return any object, the all objects of methods will be available for GC.

    }


    public static String m2(){

        s= new String("Static");

        String s1 = new String("Shivam");
        String s2 = new String("78");

        return s1;
        // If we return any object, then it depends on whether we are holding that obj somewhere or not.
        // See in the main() where m2() is called.

    }
}

class Test {
     Test i;
}