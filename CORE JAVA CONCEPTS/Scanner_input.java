
// Created by Shivam Shukla.

import java.util.Scanner;
public class Scanner_input{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		
		System.out.println("Max : "+Math.max(a,b));
	}
}