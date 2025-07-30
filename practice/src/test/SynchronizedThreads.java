package test;

public class SynchronizedThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task1 a1 = new Task1();
		
		Work w1 = new Work(a1);
		w1.start();
		
		Work w2 = new Work(a1);
		w2.start();
		
		//shared memory causes discrepancies, multiple entries as during operation other thread might change its value
		//to resolve this to use synchronized

	}

}

class Task1 {
	int val = 0;
	
	public int increase() { //or add synchronized in method signature
		synchronized(this) { //now control will not shift from the thread unless the operation is completed
			val+=1;
			return val;	
		}
	}
	

}

class Work extends Thread {
	
	Task1 t1 = null;
	
	public Work(Task1 t1) {
		this.t1 = t1;
	}
	
	@Override
	public void run() {
		
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(Thread.currentThread().getName() + " " + t1.increase());
		}
//		try {
//			Thread.sleep(500); //can clearly understand how the threads are working
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
}