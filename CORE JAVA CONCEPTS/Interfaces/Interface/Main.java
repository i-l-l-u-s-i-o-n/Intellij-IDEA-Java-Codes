
// Created by Shivam Shukla.

import myInterface.*;

public class Main implements myInterface{
	
	// The method of an interface which has to be implemented , must be declared """"""""""""PUBLIC"""""""""""""""" 
	public void welcome(){
		System.out.println("Hello from method defined in the interface!");
	}
	
	public void details(){
		System.out.println("Name: "+name+ " & ID : "+ Id );
		// System.out.println("Name: "+myInterface.name+ " & ID : "+ myInterface.Id );  We can also do this.
	}
	
	public static void main(String[] args){
		
		Main m=new Main();
		
		m.details();
		
		
	}
}