package assignments;

import java.util.concurrent.BlockingQueue;

public class ProducerABQ implements Runnable {
	BlockingQueue<Integer> product_list = null;
	
	public ProducerABQ(BlockingQueue<Integer> product_list) {
		this.product_list = product_list;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int product_no = 0;
		while (true) {
			try {
				synchronized(this) {
					int nextProd = product_no++;
					System.out.println("Added a new Product!" + nextProd);
					product_list.put(nextProd); //.put is the modification of the .add method
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
