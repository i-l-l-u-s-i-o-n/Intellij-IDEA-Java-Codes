
// Creaetd by Shivam Shukla.


class ThreadA implements Runnable{
	
	//Thread body
	public void run(){
		try{
			System.out.println("Thread A details using getID(): "+Thread.currentThread().getId());
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

class Main{
	
	public static void main(String[] args){
		
		
		for(int i=0;i<10;i++){
			
			new Thread(new ThreadA()).start();
			
		}
		
		System.out.println("From Thread main() : EXITING");
	}

}

/*

OUTPUT ->
From Thread main() : EXITING
Thread A details using getID(): 21
Thread A details using getID(): 15
Thread A details using getID(): 17
Thread A details using getID(): 20
Thread A details using getID(): 13
Thread A details using getID(): 14
Thread A details using getID(): 12
Thread A details using getID(): 16
Thread A details using getID(): 18
Thread A details using getID(): 19

*/