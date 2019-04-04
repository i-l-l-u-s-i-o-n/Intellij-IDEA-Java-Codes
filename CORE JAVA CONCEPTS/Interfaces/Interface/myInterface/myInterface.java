
// Created by Shivam Shukla.

package myInterface;


//The interfaces which have only SINGLE ABSTRACT METHOD(SAM) are called FUNCTIONAL INTERFACES.
//Some Eg - Comparable(compareTo()) , Runnable(run()) ,Callable(call()) etc.

//The interfaces, which do not have any methods but provide some ability to objects are called - MARKER Interface.
//Eg - Serializable, Clonable, RandomAccess, SingleThreadModel


//Prior to java 1.8, methods are always ABSTRACT.
// After java 1.8, methods can be DEFAULT and STATIC in an interface.


public interface myInterface {
	
	// Fields are public static final .
	public static final int Id=101;
	
	// If we don't specify the public static final, then also field will be implicitly public static final.
	String name="Shivam";
	
	
	// The declaration is not allowed.
	// int x;
	
	
	// The methods are always public and abstract.
	public abstract void welcome();
	
	// No need to specify public and abstract before methods, it will be implicitly public abstract.
	void details();
	
}