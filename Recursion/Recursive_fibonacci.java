
// Created by Shivam Shukla.

public class Recursive_fibonacci{
	
	static int fib(int n){
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return (fib(n-1)+fib(n-2));
	}
	
	public static void main(String[] arr){
		
		int n=Integer.parseInt(arr[0]); //command line input
		int i=0;
		while(i<n){
			System.out.print(fib(i)+" ");
			i++;
		}
	}
}
	