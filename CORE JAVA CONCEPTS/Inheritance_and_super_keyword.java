
// Created by Shivam Shukla.

// JAVA doesn't support MULTIPLE and HYBRID inheritance .


class Vehicle{
	String name;
	int gear=0;
	Vehicle(String name){
		this.name=name;
	}
}

class Car extends Vehicle{
	int gear;
	Car(String name,int gear){
		super(name);
		this.gear=gear;
	}
	void show(){
		System.out.println("Vehicle gear : "+super.gear);
		System.out.println("Car gear : "+gear);
	}
}
public class Inheritance_and_super_keyword{
	public static void main(String [] ar){
		Car i20=new Car("i20",5);
		i20.show();
	}
}
	
	