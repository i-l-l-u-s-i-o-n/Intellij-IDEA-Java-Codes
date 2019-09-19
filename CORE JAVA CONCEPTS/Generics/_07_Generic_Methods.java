package generics;

/**
 * created by Shivam on 19-09-2019.
 */


// If we want type safety at Method level then we go for Generic methods.

    // Declaring type parameter at class level -> class S<T>{} , we can use T based on our requirement.

    // Declaring Type parameter at method level ->
            // We have to declare type param just before return type ---->
            // public <T>void m1(T obj ){ }


    // Some valid declarations ->
        // public <T extends Number>void m1(){}    we can call m1() only for Number class or its child class!
        // public <T extends Number & Runnable>void m1(){}
        // public <T extends Runnable & Comparable>void m1(){}
        // public <T extends Number & Runnable & Comparable>void m1(){}
        // public <T extends Runnable>void m1(){}



class Test {

    public <T> void printClass(T obj){
        System.out.println("This method can be called for any object!!!!!!");
        System.out.println("Class name : "+ obj.getClass().getName());
    }

    public <T extends Number & Runnable> void numberRunnable(T obj){
        System.out.println("Only params, that are child of Number and implements Runnable, are applicable.");
    }


}


public class _07_Generic_Methods {

    public static void main(String[] args) {


        Test t =new Test();

        t.printClass("Shivam");
        t.printClass(78);


        t.numberRunnable(new Temp());
//        t.numberRunnable("Shivam");    // Invalid


    }
}

class Temp extends Number implements Runnable{

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    @Override
    public void run() {

    }
}
