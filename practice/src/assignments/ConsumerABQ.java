package assignments;

import java.util.concurrent.BlockingQueue;

public class ConsumerABQ implements Runnable {
	BlockingQueue<Integer> product_list = null;
	
	public ConsumerABQ(BlockingQueue<Integer> product_list) {
		this.product_list = product_list;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Thread.sleep(1000);
				System.out.println("Taken the product! "+product_list.take()); //modification of .remove method
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
