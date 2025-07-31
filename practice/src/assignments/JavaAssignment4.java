package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class JavaAssignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Question 1: Producer-Consumer Problem Implementation using wait() and notify()
//		List<Integer> product_list = new ArrayList<>();
//		
//		Thread t1 = new Thread(new Producer(product_list));
//		Thread t2 = new Thread(new Consumer(product_list));
//		
//		t1.start();
//		t2.start();
		
		//Question2: Producer-Consumer Problem Implementation using Array Blocking Queue
		//BlockingQueue: Queue which has a fixed size, limit will automatically implemented by adding in parameter, 
		//Automatically take care of thread safety,easy addition and removal of elements
		BlockingQueue<Integer> product_list = new ArrayBlockingQueue<>(5);
		Thread t1 = new Thread(new ProducerABQ(product_list));
		Thread t2 = new Thread(new ConsumerABQ(product_list));
		
		t1.start();
		t2.start();
	}

}
