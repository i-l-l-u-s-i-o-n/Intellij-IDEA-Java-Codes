
// Created by Shivam Shukla.
 
import myPackage1.Special;



public class Special2{               
	  
	public void msg(){
		System.out.println("Message from Special2 main class !");
	}
	
	public static void main(String [] args){
		
		Special s=new Special();
		s.msg();
		
		myPackage1.Special2 s21=new myPackage1.Special2();
		s21.msg();
		
		
		Special2 s2=new Special2();
		s2.msg();
	}
}
