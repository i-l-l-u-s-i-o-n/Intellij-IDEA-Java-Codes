
// Created by Shivam Shukla.

class Main{
	public static void main(String [] args){
		try{
			// To catch divide-by-zero.
			int a=args.length;
			int b=42/a;
			// Divide-by-zero exception.
			System.out.println("a = "+ a);
			if(a==1)
				a=a/(a-a);
			// Another divide-by-zero exception.
			try{
				// nested try block
				if(a==2){
					// If 2 command-line args are used, then an out-of-bound
					int c[]={1};
					c[2]=99;
				}
				
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Array index out-of-bound " +e);
			}
		}
		catch(ArithmeticException e){
			System.out.println("Divide by 0 : "+e);
		}
	}
}