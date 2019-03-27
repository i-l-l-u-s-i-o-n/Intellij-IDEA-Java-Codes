
// Created by Shivam Shukla.

class A extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            if (i==2)

                //yield() basically means that the thread is not doing anything particularly
                //important and if any other threads or processes need to be run, they should run.
                //Otherwise, the current thread will continue to run.
				
				
                Thread.yield();
            System.out.println("A : value of i : "+i);
        }
    }
}
class B extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            if (i==3)
                // Stop() permanently stops the thread and thread can't be resumed.
                stop();
            System.out.println("B : value of i : "+i);
        }
    }
}
class C extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            if (i==2) {
                try {


                    //sleep(): This method causes the currently executing thread to sleep for the specified number of milliseconds

                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("C : value of i : "+i);
        }
    }
}

class Main {

    public static void main(String[] args) {

        new A().start();
        new B().start();
        new C().start();
        System.out.println("Exiting from main");
    }
}

/* 
OUTPUT ->

Exiting from main
A : value of i : 0
B : value of i : 0
C : value of i : 0
B : value of i : 1
A : value of i : 1
B : value of i : 2
C : value of i : 1
A : value of i : 2
A : value of i : 3
A : value of i : 4
C : value of i : 2
C : value of i : 3
C : value of i : 4

*/

			