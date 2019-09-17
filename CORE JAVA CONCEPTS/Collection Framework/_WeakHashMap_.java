package collection;

import java.util.HashMap;
import java.util.WeakHashMap;

/**
 * created by Shivam on 17-09-2019.
 */
public class _WeakHashMap_ {


    public static void main(String[] args) throws Exception {


        // In case of HashMap, even though a object doesn't have the reference but is currently used by HashMap as a Key or Value,
        // then it will be not available for GARBAGE COLLECTION.

        // Example ->
        HashMap hashMap = new HashMap();

        //Creating a new Temp object
        Temp t1 =new Temp();

        // Adding it to hashMap
        hashMap.put(t1,"Temp");

        // Now setting t1 to null.
        t1=null;

        // Now garbage collector will reach the temp object to destroy!!!!!!
        // But HashMap won't allow GC to destroy temp object even though it is set to null because temp object is used as a key in HashMap!!!!!!!!!!
        // So HashMap DOMINATES over GC and prevents GC to destroy objects that are used in HashMap.

        Thread.sleep(2000);

        // Calling garbage collector BUT it will not destroy Tem object!
        System.gc();

        // We can check this as finalise() will not be called!
        // So no Output.


        System.out.println(hashMap);          // {Temp=Temp}
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        // BUT in case of WeakHashMap, the GC dominates over the WeakHashMap hence named as WeakHashMap.

        WeakHashMap weakHashMap = new WeakHashMap();

        t1=new Temp();

        weakHashMap.put(t1,"Temp");

        // Now setting t1 to null;
        t1=null;

        // Now calling GC to destroy temp object and it will be destroyed.
        Thread.sleep(2000);

        System.gc();                 // Garbage Collector called!! (It will call the finalize())

        System.out.println(weakHashMap);          // {}         (As the key is removed so value is also removed!!)


    }
}



class Temp{

    @Override
    public String toString() {
        return "Temp";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collector called!!");
    }
}