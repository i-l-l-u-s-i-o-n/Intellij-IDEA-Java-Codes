
// Creaetd by Shivam Shukla.

class ThreadA extends Thread{

    //Thread body
    public void run(){
        for(int i=1;i<5;i++){
            System.out.println("From Thread A : "+i*10);
        }
        System.out.println("From Thread A : EXITING");
    }
}


class ThreadB extends Thread{

    //Thread body
    public void run(){
        for(int i=1;i<5;i++){
            System.out.println("From Thread B : "+i*100);
        }
        System.out.println("From Thread B : EXITING");
    }
}

class ThreadC extends Thread{

    //Thread body
    public void run(){
        for(int i=1;i<5;i++){
            System.out.println("From Thread C : "+i*1000);
        }
        System.out.println("From Thread C : EXITING");
    }
}


class Main{

    // main() is itself a thread.
    // So in execution of java program, at least one thread is always executed.
    public static void main(String[] args){

        ThreadA t1=new ThreadA();
        ThreadB t2=new ThreadB();
        ThreadC t3=new ThreadC();

        // Assigning priorities.
        t3.setPriority(Thread.MAX_PRIORITY);  // Predefined MAX_PRIORITY

        t2.setPriority(t1.getPriority()+1);

        t1.setPriority(Thread.MIN_PRIORITY);

        // Starting the execution of thread .
        t1.start();
        t2.start();
        t3.start();   // this will run first as max priority is assigned to it;

        System.out.println("From Thread main() : EXITING");
    }

}

/* 
OUTPUT ->

From Thread main() : EXITING
From Thread C : 1000
From Thread C : 2000
From Thread C : 3000
From Thread C : 4000
From Thread C : EXITING
From Thread A : 10
From Thread A : 20
From Thread B : 100
From Thread B : 200
From Thread B : 300
From Thread B : 400
From Thread B : EXITING
From Thread A : 30
From Thread A : 40
From Thread A : EXITING


*/