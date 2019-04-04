package com.shivam;

/**
 * created by Shivam on 04-04-2019.
 */

interface Hello{
    void sayHello();
}


interface Adder{
    int add(int a,int b);
}


interface Square{
    int sqr(int n);
}


interface Vehicle{

    //Fields are implicitly public static final.
    int gear=5;
    void move(int speed);


    // Default and Static methods can be there in functional Interface
    default void start(){
        System.out.println("Vehicle Started !");

    }

    static void showStatus(){
        System.out.println("Vehicle is at gear : "+gear);
    }
}

//Without using Lambda.
//class NotUsingLambda implements Hello{
//
//    @Override
//    public void sayHello() {
//        System.out.println("Hello from interface!");
//    }
//
//    public static void main(String[] args) {
//        Hello h=new NotUsingLambda();
//
//        h.sayHello();
//    }
//
//}


// Using LAMBDA Expression.
public class Lambda_Expression_Example {

    public static void main(String[] args) {

        //Eg1.

        // Calling the LAMBDA EXPRESSION.
        Hello hello= () -> System.out.println("Hello from Lambda Expression!");
        // Since there is only 1 abstract method, so compiler will automatically know that this is the implementation
        // for that single abstract method(SAM).
        // That's why Lambda expression are only called in case of FUNCTIONAL INTERFACES.

        hello.sayHello();

        //=============================================================================================//

        //Eg2.

        Adder adder= (a,b) -> a+b;

        System.out.println("Sum : "+adder.add(5,7));

        //=============================================================================================//

        //Eg3.

        //Square square= (int n) -> { return  n*n ;};
        //Square square= (n) -> { return n*n;};
        Square square= n -> n*n;

        System.out.println("Square : "+square.sqr(12));

        //=============================================================================================//

        //Eg4.

        Vehicle i20= n -> System.out.println("Vehicle is moving at speed : "+n + "kmph");

        i20.start();
        Vehicle.showStatus();
        i20.move(120);


        Vehicle R8= n -> {
            System.out.println("Vehicle is moving at speed : "+n + "kmph");
            Vehicle.showStatus();
        };

        R8.start();
        R8.move(200);

    }
}
