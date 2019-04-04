package com.shivam;

/**
 * created by Shivam on 04-04-2019.
 */


// Since Runnable his FUNCTIONAL INTERFACE as it has SINGLE ABSTRACT METHOD(SAM) i.e. Run(),
// So we can use LAMBDA here.



// Without using LAMBDA.
class MyThread implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("From thread MyThread : "+i);
        }
    }
}




public class Lambda_Exp_in_Multithreading {

    public static void main(String[] args) {

        Thread thread1=new Thread(new MyThread());
        thread1.start();



        //============================== USING LAMBDA ===================================================//

        Runnable r= () -> {
            for (int i=0;i<10;i++){
                System.out.println("Using LAMBDA : "+i);
            }
        };


        Thread t=new Thread(r);
        t.start();

        //=================================================================================================//


        for (int i=0;i<10;i++){
            System.out.println("From Main Thread : "+i);
        }

    }

}
