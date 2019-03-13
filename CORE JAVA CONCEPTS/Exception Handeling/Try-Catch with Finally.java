
// Created by Shivam Shukla.

class Main{
	public static void main(String [] args){
		int i=0;
		String numbers[]= { "1", "2", "3", "4", "5" };
		while(i<5){
			try{
				System.out.println(numbers[i]);
				i++;
			}
			catch(Exception e){
				System.out.println(e.toString());
			}
			finally{
				System.out.println("Hi ! I'll always print .");
				if(i<4);
				else{
					System.out.println("You should quit and reset value");
				}
			}
		}
	}
}

// OUTPUT ->

/*

1
Hi ! I'll always print .
2
Hi ! I'll always print .
3
Hi ! I'll always print .
4
Hi ! I'll always print .
You should quit and reset value
5
Hi ! I'll always print .
You should quit and reset value

*/
