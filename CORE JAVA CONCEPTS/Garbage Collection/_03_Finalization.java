package garbageCollection;

/**
 * created by Shivam on 20-09-2019.
 */
public class _03_Finalization {

    public static void main(String[] args) throws Throwable{


        // Just before destroying an object, GC calls the finalize() on the object to perform cleanup activities
        // and to perform resource de-allocation activities.

        // Method declaration ->
            // protected void finalize throws Throwable();

            // We can OVERRIDE this method to perform the required cleanup activities.

        // finalize() present in Object class, hence available to all java objects.....


        // Some loopholes!!!!!!!!!!!

        // Loophole 1->

        String s =new String("Shivam");

        s=null; // s is available for GC.

        System.gc();    // It may call GC and if it runs GC, it will call finalize of String class as only string obj(s) is available for GC.


        _03_Finalization obj = new _03_Finalization();

        obj=null;

        // GC is a daemon thread which runs in background!
        System.gc();  // If JVM runs GC, then there will be 2 threads. (main and GC)
                        // So the order of main thread sop statement and finalize() sop statement may vary.

        System.out.println("Main thread ends here!");

        // Possible O/P ->

        //Finalize method called by GC on _03_Finalization class Object!!!!
        //Main thread ends here!

        //Main thread ends here!
        //Finalize method called by GC on _03_Finalization class Object!!!!

        //Main thread ends here!                                              // In case gc was not called by JVM.


        // Loophole 2->

        // We can call finalize() explicitly. It will be a normal method call and the object won't be destroyed!
        obj = new _03_Finalization();

        obj.finalize();     // Finalize method called by GC on _03_Finalization class Object!!!!
        obj.finalize();     // Finalize method called by GC on _03_Finalization class Object!!!!

        obj=null;

        System.gc();        // Finalize method called by GC on _03_Finalization class Object!!!!


        // Loophole 3 ->

        // If we call finalize() and a exception occurs, the program will be terminated immediately if it is not handled.
        // BUT if JVM call GC and then Gc call finalize() then if an exception occurs then also the program will not terminate and JVM will IGNORE that exception!!!!!!


        // Loophole 4->

        FinalizeDemo f= new FinalizeDemo();


        System.out.println(f.hashCode());                       //475266352
        f=null;


        System.gc();   // It will call finalize but in the finalize the static variable obj is used to hold the reference of this object.
                        // So gc will not be able to destroy the current object.

        // The finalize method will be called only once for an object!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        Thread.sleep(2000);

        System.out.println(FinalizeDemo.obj.hashCode());        //475266352

        FinalizeDemo.obj = null;

        System.gc();         // Now the reference of the object won't be set to obj as GC will not call finalize this time !!!!! It calls finalize only once!!!!

        // Loophole 5 ->

        // We can't expect exact behaviour of GC , it is varied from JVM to JVM , so for following ques, we can't give exact answers ->

            // When JVM will call GC?
            // In which order GC identifies eligible objects?
            // In which order GC destroys eligible object?
            // Whether GC destroys all eligible obj or not?
            // What algorithm is followed by GC ? ( generally Mark and Sweep)

        // Whenever programs runs with low memory, JVM runs with GC but how many objects it will destroy is unpredictable .
        // Example ->

        for (int i = 0; i < 10000; i++) {
            Test t = new Test();
            t=null;                      // GC will be called when memory will be low But we can't say how many objects will be destroyed....We can check that as the finalize() prints the count, so we can know how many objects are destroyed.
        }

    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called by GC on _03_Finalization class Object!!!! ");
    }
}

class FinalizeDemo {

    static FinalizeDemo obj;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize called for FinalizeDemo object !!!!!!! ");
        obj= this;  // Again setting reference to the current object!
    }

}

class Tets{

    static int count =0;
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize called : "+ ++count);
    }
}
