package assignments;

import java.util.List;

public class Producer implements Runnable {
	
	List<Integer> product_list = null;
	int limit = 5;
	int product_no;
	
	public Producer(List<Integer> product_list) {
		this.product_list = product_list;
	}
	
	public void SeeProduct(int product_no) throws InterruptedException {
		
		//lock on product_list
		synchronized(product_list) {
			while(product_list.size() == limit) {
				System.out.println("Demand Overloaded!");
				product_list.wait(); //communicate with consumer thread that proceed to take products out (intra thread communication)
			}
		}
		
		synchronized(product_list) {
			System.out.println("New Product: "+product_no);
			product_list.add(product_no);
			Thread.sleep(100);
			product_list.notify(); //tell consumer that another product is added (intra thread communication)
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int product_no = 0;
		while (true) {
			try {
				SeeProduct(product_no);
				product_no++;
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
