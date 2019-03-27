
// Created by Shivam Shukla.

//suspend and resume are depriciated methods from Java 2 and later 
// If a thread has a lock on shared variable and is suspended and never resumed, think out of the consequences .........


class A extends Thread{

    @Override
    public void run() {
        try{
            System.out.println("First Thread starts running !");

            sleep(10000); // Sleep for 10 seconds

            System.out.println("First Thread finished running !");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class B extends Thread{

    @Override
    public void run() {
        try {
            System.out.println("Second Thread starts running! ");
            System.out.println("Second thread is suspended  :( ");
            suspend();
            System.out.println("Second Thread is revived and runs again.");
            System.out.println("Second Thread finishes it's execution.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Main {

    public static void main(String[] args) {

        A a=new A();
        B b=new B();

        a.start();
        b.start();

        // As the thread b is suspended , so we can resume it :)
        b.resume();



        System.out.println("Exiting from main");
    }
}
