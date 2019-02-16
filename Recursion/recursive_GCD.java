
// Created by Shivam Shukla.

public class recursive_GCD{
	
	static int GCD(int m,int n){
		if(m>n)
			return GCD(n,m);
		if(m==n)
			return m;
		if(m==0)
			return n;
		if(m==1)
			return 1;
		return GCD(m,n%m);
	}
	
	public static void main (String [] ar){
		int m=Integer.parseInt(ar[0]);
		int n=Integer.parseInt(ar[1]);
		System.out.printf("GCD of %d & %d is %d",m,n,GCD(m,n));
	}
}
