
// Creaetd by Shivam Shukla.

class ThreadA extends Thread{
	
	//Thread body
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("From Thread A : "+i*-10);
		}
		System.out.println("From Thread A : EXITING");
	}
}


class ThreadB extends Thread{
	
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
		
		ThreadA t1=new ThreadA();
		ThreadB t2=new ThreadB();
		
		// Starting the execution of thread .
		t1.start();
		t2.start();
		
		System.out.println("From Thread main() : EXITING");
	}

}