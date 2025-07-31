package test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrencyWithCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mine m1 = new Mine();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				m1.add();
			}
		});
		
		Thread t2= new Thread(new Runnable() {
			@Override
			public void run() {
				m1.print();
			}
		});
		
		t1.start();
		
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
//		try {
//			t1.join();
//		} catch(InterruptedException e) {
//			e.printStackTrace();
//		}
		
		t2.start();
		
		//adding and reading values at same time not allowed so throws this exception
		//collection framework in java are not allowed to be synchronized
//		Exception in thread "Thread-1" java.util.ConcurrentModificationException
//		at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
//		at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
//		at practice/test.Mine.print(ConcurrencyWithCollections.java:59)
//		at practice/test.ConcurrencyWithCollections$2.run(ConcurrencyWithCollections.java:23)
//		at java.base/java.lang.Thread.run(Thread.java:833)
		
		//1. To use Synchronized method
		//this will resolve the above exception
		
		//2. To write t1.join();
		//will wait till thread execution and then join
		//Problem is this is not exactly multiprogramming
		//we need adding and printing being done at same time, not what we want
		
		//3. Using CopyOnWriteArrayList
		//this introduced in Java 5 or 7
		//
		

	}

}

class Mine {
	List<Integer> arr = new CopyOnWriteArrayList<Integer>();
	
	public void add() {
		
		for(int i = 0 ; i < 1000 ; i++) {
			arr.add(i);
			System.out.println("Added");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void print() {
		for(int i:arr) {
			System.out.println(i);
			System.out.println("Printed");
			try {
				Thread.sleep(10);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
