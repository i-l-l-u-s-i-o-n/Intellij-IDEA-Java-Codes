
// Created by Shivam Shukla.

public class recursion_eg1{
	
	static void print(int c){
		if(c==0)
			return;
		System.out.println("Hello Counter : "+c);
		print(--c);
		System.out.println("Hello Counter : "+c);
		return;
	}
	
	public static void main (String [] ar){
		print(10);
	}
}


// OUTPUT
/*
Hello Counter : 10
Hello Counter : 9
Hello Counter : 8
Hello Counter : 7
Hello Counter : 6
Hello Counter : 5
Hello Counter : 4
Hello Counter : 3
Hello Counter : 2
Hello Counter : 1
Hello Counter : 0
Hello Counter : 1
Hello Counter : 2
Hello Counter : 3
Hello Counter : 4
Hello Counter : 5
Hello Counter : 6
Hello Counter : 7
Hello Counter : 8
Hello Counter : 9
*/