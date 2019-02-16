

// Created by Shivam Shukla.

public class System_out_print_statement{
	public static void main(String args[]){
		int x=34;
		float n=234556.453f; //f is necessary after a float value else it will take it as double.
		
		System.out.println("x: "+x);
		System.out.println("n: "+n);
		
		System.out.print("x: "+x);
		System.out.print("n: "+n);
		System.out.println();
		
		// Printing integer
		System.out.printf("x: %d\n",x);
		
		//Printing float
		System.out.printf("n: %f\n",n);
		
		//Printing float upto 4 decimal places. 
		System.out.printf("PI: %.4f\n",Math.PI);
		
		// Printing value at margin of 20 characters from right and upto 2 decimal places.
		System.out.printf("n: %20.2f",n);
		
		//Printing value with less number of digit before and after the decimal , than it actually has i.e n=234556.453f 
		// So it has 6 digit before decimal and 3 digit after decimal , So if we print upto 5 decimal places after decimal, 
		//it will change the output to be approximate .
		// But before decimal it has 6 digits and we print only 5, then it will not do anything , it simply print all 6 digits . See following example.
		System.out.printf("n: %5.5f",n);  // output = n: 234556.45313
	}
}
	