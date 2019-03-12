
// Created by Shivam Shukla.

class Main{
	
	public static void main(String[] args){
		
		try{
			int i=args.length;
			String myString[]=new String[i];
			myString=args;
			// If i=0 then myString null Pointer Error.
			if(myString[0].equals("Shivam")){
				System.out.println("First word is Shivam");
			}
			System.out.println("No of arguments:  "+i);
			int x=12/i;
			int y[]= {22,19};
			y[i]=x;
		}
		catch(ArithmeticException e){
			System.out.println("Division by zero : " + e);
		}
		catch(NullPointerException e){
			System.out.println("Null Pointer : " + e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index OOB : " + e);
		}
	}
}