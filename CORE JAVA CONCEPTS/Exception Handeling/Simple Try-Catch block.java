class Main{
	static int result(int x,int y){
		try{
			int a=x/y;
			return a;
		}
		catch(ArithmeticException e){
			System.out.println("Divivsion by zero ");
		}
		return 0;
	}
	
	public static void main(String[] args){
		int a,b,result;
		a=0;b=0;
		try{
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			System.out.println("Value of a and b : "+a+"    " +b);
		}
		catch(Exception e){
			System.out.println("Some Error !");
		}
		result=result(a,b);
		System.out.println("Result :  "+result);
	}
}