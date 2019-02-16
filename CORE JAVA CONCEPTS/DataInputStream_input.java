
// Created by Shivam Shukla.

import java.io.*;

public class DataInputStream_input{
	
	public static void main(String []args) throws Exception{
		
		Float principal_Amount=new Float(0); // Float can also be declared this way.
		Float rate_Of_Intrest=new Float(0); // Float can also be declared this way.
		
		int no_of_Years=0;

		String tempString;
			
		DataInputStream in=new DataInputStream(System.in); // System.in indicates that data is to read from the keyboard, not from any file or something else.
		
		System.out.println("Enter Principal Amount : ");
		tempString=in.readLine();
		
		principal_Amount=Float.valueOf(tempString);
		System.out.flush(); // To clear the input buffer.
		
		System.out.println("Enter Intrest rate : ");
		tempString=in.readLine();
		
		rate_Of_Intrest=Float.valueOf(tempString);
		System.out.flush();
		
		System.out.println("Enter No. of Years : ");
		tempString=in.readLine();
		
		no_of_Years=Integer.parseInt(tempString);
		
		float total_intrest=principal_Amount*no_of_Years*rate_Of_Intrest;
		
		System.out.printf("Total Intrest for %f amount in %d years at %f rate is -> %f",principal_Amount,no_of_Years,rate_Of_Intrest,total_intrest);
	}
}