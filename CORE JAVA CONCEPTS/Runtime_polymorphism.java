

// Created by Shivam Shukla.

// Runtime Polymorphism is also called Dynamic Method Dispatch:

class Bike{
	void run(){
		System.out.println("Bike Running");
	}
}

class Ducati extends Bike{
	
	// Method Overriding
	void run(){
		System.out.println("Ducati running");
	}
}

public class Runtime_polymorphism{
	
	public static void main(String []ar){
		
		Bike b1=new Bike();
		b1.run();
		
		Ducati d1=new Ducati();
		d1.run();
		
		// RunTime Polymorphism
		
		Bike special=new Ducati(); // Here the Bike object 'special' will change at runtime to Ducati object. This is RunTime Polymorphism.
		special.run();   // OUTPUT ->  Ducati Running . 
		
		
	}
}


	
	
	
	
	