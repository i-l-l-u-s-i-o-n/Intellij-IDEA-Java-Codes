
// Created by Shivam Shukla.

abstract class Vehicle{
	// Abstract class can have variables.
	// Also can have static and final variables.
	String name;
	static final int ID=544;
	
	// Abstract class can have CONSTRUCTOR.
	Vehicle(String name){
		this.name=name;
	}
	
	
	// Abstract class can have non-abstract emthod.
	void init(){
		System.out.println("Initialising Vehicle");
	}
	
	//Abstract class can have abstract methods.
	abstract void start();
	
	
	// Abstract class can have final methods (can't overridden).
	final void stop(){
		System.out.println("Vehicle stopped");
	}
}

class Car extends Vehicle{
	
	int gear;
	
	Car(String name){
		super(name);
	}
	
	void start(){
		System.out.println("Car is starting");
	}
	
	void setGear(int gear){
		this.gear=gear;
		System.out.println("Car "+super.name+" is on gear : "+gear);
	}
}

public class Abstract_class{
	public static void main(String[] ar){
		Car car= new Car("i20");
		car.init();
		car.start();
		car.setGear(4);
		car.stop();
		
	}
}

		
	
	
