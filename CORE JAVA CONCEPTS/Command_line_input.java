
// Created by Shivam Shukla.

public class Command_line_input{
	
	// It is not necessary to use String [] args, instead of args , we can use any name for array i.e. psvm(String[] arr) etc.
	
	public static void main(String x[]){ 
		 //int i=0; If we do this here and also in for() It will give ERROR
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
		System.out.println();
		for(String s:x){
			System.out.println(s);
		}
		
		//For intregers , we have to parese into int using -> Intege.parseInt(str);
		
		int sum=0;
		for(int i=0;i<x.length;i++){
			sum+=Integer.parseInt(x[i]);
		}
		System.out.println("Sum : "+sum);
		
		//System.exit(0);
	}
}

//After compiling Just give input as follows
//java Command_line_input Hello This is command line input

		