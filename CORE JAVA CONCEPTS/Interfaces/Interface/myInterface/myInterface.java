
// Created by Shivam Shukla.

package myInterface;

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