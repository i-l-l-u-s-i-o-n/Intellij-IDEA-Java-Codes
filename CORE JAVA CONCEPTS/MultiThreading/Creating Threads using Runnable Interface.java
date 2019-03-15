
// Creaetd by Shivam Shukla.


// Creating thread using runnable interface is necessary when our css already extens another class.
// As java doesn't support multiple inheritance, So we use ruunable interface to implement Runnable to use the functionality of Thread .

class ThreadA implements Runnable{
	
	//Thread body
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("From Thread A : "+i*-10);
		}
		System.out.println("From Thread A : EXITING");
	}
}


class ThreadB implements Runnable{
	
	//Thread body
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("From Thread B : "+i*10);
		}
		System.out.println("From Thread B : EXITING");
	}
}


class Main{
	
	// main() is itself a thread.
	// So in execution of java program, at least one thread is always executed.
	public static void main(String[] args){
		
		ThreadA a=new ThreadA();
		ThreadB b=new ThreadB();
		
		//We have to pass the object of ThreadA and ThreadB to the Thread class constructor.
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		
		
		// Starting the execution of thread .
		t1.start();
		t2.start();
		
		System.out.println("From Thread main() : EXITING");
	}

}