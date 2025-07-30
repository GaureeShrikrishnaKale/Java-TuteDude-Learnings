package test;

public class ThreadingMultiProgramming {
	
	//Multiple programs and processes running at the same time 
	
	//Thread: Thread is a process, subtask
	public static void main(String args[]) {
		System.out.println("Happy"); // when hit the run button, basically shoots up the new thread public static void main, and starts running it.
		// we can make many thread at the same time 
		
		//1. Multithreading using Thread class
		System.out.println("Thread 1 is starting...");
		Task t1 = new Task("First Thread");
		t1.start(); //to start call the thread
		
//		t1.start(); //we cannot again start the thread, not allowed and not a good practice.
		
		//instead have new instance
		System.out.println("Thread 2 is starting...");
		Task t2 = new Task("Second Thread");
		t2.start(); //allowed and good practice
		
		//----
		//2. Multithreading using Runnable interface
		TaskFromInterface t3 = new TaskFromInterface("Thread 1 Runnable Interface");
//		t3.run(); //no multithreading, if just use run directly
		Thread ta = new Thread(t3); //this will lead to allow to call start method and have multithreading
		ta.start();
		
		TaskFromInterface t4 = new TaskFromInterface("Thread 2 Runnable Interface");
		Thread tb = new Thread(t4);
		tb.start();
		
		System.out.println("Being Happy"); //even if it is written below it get printed before numbers
		//because we used thread interface
		//start method created new thread
		//java just started the tread, and continued to execute other lines
		//take some time to shoot and start and run 
		//in mean time printed 
		
	}
	

}

class Task extends Thread {
	
	String name;
	
	public Task(String name) {
		this.name=name;
	}
	
	@Override
	public void run() {
		Thread.currentThread().setName(this.name);
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("i: "+ i + " " + Thread.currentThread().getName());
		}
		try {
			Thread.sleep(10); //can clearly understand how the threads are working
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

class TaskFromInterface implements Runnable {
	
	String name;
	
	public TaskFromInterface(String name) {
		this.name=name;
	}
	
	@Override
	public void run() {
		Thread.currentThread().setName(this.name);
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("i: "+ i + " " + Thread.currentThread().getName());
		}
		try {
			Thread.sleep(10); //can clearly understand how the threads are working
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
