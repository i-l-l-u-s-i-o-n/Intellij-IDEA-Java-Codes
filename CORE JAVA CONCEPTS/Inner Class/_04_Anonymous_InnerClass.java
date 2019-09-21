package innerClass;

/**
 * created by Shivam on 21-09-2019.
 */
class Main {

    public static void main(String[] args) {


        // Sometimes we can declare inner class without name , such type of inner class are called Anonymous Inner Class.


        // Main purpose is just for instant use (1 time usage).

        // 3 types of AIC ->
            // AIC that extends a Class.
            // AIC that implements an interface.
            // AIC that is defined inside arguments.

        ////////////////////////////////////////////////////////////////////////////////////////////////////////

        //1.) AIC that extends a Class ->

        // Suppose we have a requirement that we have to give the custom implementation of Popcorn class taste().
        // But only for 1 time.
        // One option is to create a child class and override taste().
        // BUT since it is required only one time so why to go for child class.
        // We can simply create AIC to fulfill that requirement.


        // Here we are declaring a class that extends Popcorn without name(AIC)
        // For that child class we are creating an object with parent reference.

        Popcorn p =new Popcorn(){

            // we have created a AIC which extends Popcorn class, Now we can give our own implementation to taste().
            public void taste(){
                System.out.println("Spicy!!");
            }

        };

        p.taste();              // Spicy!!


        Popcorn p1 =new Popcorn();
        p1.taste();             // Salty!!


        Popcorn p2 = new Popcorn(){

            // Another AIC for 1 time use only

            @Override
            public void taste() {
                System.out.println("Sweet!!");
            }
        };

        p2.taste();             // Sweet!!


        // Upto this 4 class files will be created->
        // Popcorn.class
        // Main.class
        // Main$1.class             // As AIC was defined in Main class and it doesn't have any name so first will be Main$1.class.
        // Main$2.class

        System.out.println(p.getClass().getName());         // innerClass.Main$1
        System.out.println(p1.getClass().getName());        // innerClass.Popcorn
        System.out.println(p2.getClass().getName());        // innerClass.Main$2


        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Creating Thread class object using AIC->

        Thread t =new Thread(){

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("From thread t : "+i);
                }
            }
        };

        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("From Thread Main : "+i);
        }


        //////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 2.) AIC that Implements an Interface ->

        // The best example is creating a thread using Runnable interface ->


        // Here we are creating a AIC which implements Runnable interface.

        Runnable r =new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("From Thread r : "+i);
                }
            }
        };

        new Thread(r).start();


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 3.) AIC that is defined inside the arguments.

        // In the above example, we are passing Runnable r to the Thread class constructor as a argument.
        // We can directly create AIC inside the argument to the constructor of thread class.

        new Thread(new Runnable(){
            public void run(){
                for (int i = 0; i < 10; i++) {
                    System.out.println("From Anonymous inner class defined in the argument : "+i);
                }
            }
        }).start();

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}


class Popcorn{

    public void taste(){
        System.out.println("Spicy!");
    }

    // 100 more methods.....

}
