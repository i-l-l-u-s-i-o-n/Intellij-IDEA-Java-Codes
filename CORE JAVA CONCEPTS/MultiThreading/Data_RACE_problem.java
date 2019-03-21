
// Creaetd by Shivam Shukla.

class ThreadA extends Thread{

    static int count;

    public void run(){


        for(int i=1;i<100;i++){

            count=count+1;
            count=count-1;
        }

        // At the end of the loop the value of count should be 0;
        // But due to RACE problem it may not be 0;
    }
}



class Main{

    public static void main(String[] args){

        ThreadA.count=0;
        for (int i = 0; i < 500; i++) {
            new ThreadA().start();
            System.out.println("Count : "+ ThreadA.count);
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(ThreadA.count);
    }

}

/*
OUTPUT ->

Count : 0
Count : 0
Count : 0
Count : 0
Count : 0
Count : 0
Count : 0
Count : 0
Count : 7
Count : 7
Count : 7
Count : 7
Count : 7
Count : 7
Count : 7
Count : 7
Count : 7
Count : 7
Count : 7
Count : 23
Count : 23
Count : 23
Count : 23
Count : 23
Count : 23
Count : 23
Count : 23
Count : 23
Count : 23
Count : 23
Count : 23
Count : 23
Count : 23
Count : 23
Count : 23
Count : 23
Count : 23
Count : 23
Count : 23
Count : 23
Count : 23
Count : 23
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 26
Count : 27

.........so on

 */