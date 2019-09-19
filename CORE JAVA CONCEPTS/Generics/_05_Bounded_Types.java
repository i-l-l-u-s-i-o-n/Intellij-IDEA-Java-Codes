package generics;

/**
 * created by Shivam on 19-09-2019.
 */


// We can bound the type parameter for the particular range ONLY by using EXTENDS KEYWORD(not implements or super etc...)! Such type are called Bounded Type.

    // Eg. ->
        // class Temp<T>   -> Here T is UNBOUNDED and can be any Object!

        // class Temp<T extends x>   --> Here T Must be x or the child class of class x. So it is Bounded Type.
        //                               x can be the CLASS or INTERFACE.


    /////////////////////////////////////////////////////////////////////////////////////////////////

    // It is not required to take T as a type parameter symbol, we can take any valid Java Identifier!!!!!!

    // ALso we can take any number of parameters based on our requirements!!!!!!!!!!!!!!!!!!!!!
    // Eg-> In HashMap, there are 2 type parameter -> HashMap(K,V) k->Key, v->value

    ///////////////////////////////////////////////////////////////////////////////////////////////////


// Unbounded Type Parameter
class Unbounded<T>{


}


// Bounded Type Parameter
class Bounded<T extends Number>{

    T n1,n2;

    public Bounded(T n1, T n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

}

class Bounded1<AnyValidJavaIdentifier extends  Runnable>{

}


//////////////////////////////////////////////////////////////////////

// We can define bounded types in combination also!!!!!!!!!!

// suppose we need object which are Child of Number and Implements Runnable interface.
// First we have to specify the Class and the after & , the interfaces should be specified.
class ClassAndInterface<T extends Number & Runnable >{

}


// Classes which implements Runnable and Comparable interfaces.
class OnlyInterfaces<T extends Runnable & Comparable>{

}


// Class which are child of number and implements Runnable and Comparable!
class ClassesAndInterfaces<T extends Number & Runnable & Comparable>{

}

// T can't extend more than 1 Class!!!!!!!!!!!!!!!!!!!!

class MultipleTypeParameters<A , B, C>{


}



public class _05_Bounded_Types {

    public static void main(String[] args) {

        Unbounded<String> u1 =new Unbounded<>();                //Valid
        Unbounded<Integer> u2 =new Unbounded<>();               //Valid

        Bounded<Integer> b1 =new Bounded<>(78,1);               // Valid
        Bounded<Double> b2 =new Bounded<>(78.0,1.0);            // Valid
//        Bounded<String> b3 = new Bounded<String>("SHIVAM");   // INVALID!

        Bounded1<Runnable> b4 = new Bounded1<>();               // Valid
        Bounded1<Thread> b5 = new Bounded1<>();                 // Valid


        MultipleTypeParameters<Integer ,String, Thread> mtp =new MultipleTypeParameters<>();  // Valid


    }

}
