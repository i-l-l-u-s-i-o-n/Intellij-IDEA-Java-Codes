
// Created by Shivam Shukla.

class Circle{
	double x;
	double y;
	double r;
	
	Circle(double x,double y, double r){
		this.x=x;
		this.y=y;
		this.r=r;
	}
	
	Circle(double r){
		this(0.0,0.0,r);  // It must be the first line in the constructor!!
	}
	
	Circle(Circle c){
		this(c.x,c.y,c.r);
	}
	
	Circle (){
		this(0.0,0.0,1);
	}
	
	double circumference(){
		return 2*3.14*r;
	}
	
	double area(){
		return (22/7)*r*r;
	}
}

public class Encapsulation_and_this_keyword{
	public static void main(String[] args){
		Circle c1=new Circle(4,4,10);
		Circle c2=new Circle(10);
		Circle c3=new Circle(c2);
		Circle c4=new Circle();
		
		System.out.println("Cir : " +c1.circumference());
		System.out.println("Cir : " +c2.circumference());
		System.out.println("Cir : " +c3.circumference());
		System.out.println("Cir : " +c4.circumference());
		System.out.println("Area : " +c1.area());
		System.out.println("Area : " +c2.area());
		System.out.println("Area : " +c3.area());
		System.out.println("Area : " +c4.area());
	}
}

		