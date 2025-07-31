package assignments;

import java.util.List;

public class Consumer implements Runnable{
	
	List<Integer> product_list = null;
	
	public Consumer(List<Integer> product_list) {
		this.product_list = product_list;
	}
	
	public void TakeProduct() throws InterruptedException {
		
		//lock on product_list
		synchronized(product_list) {
			while(product_list.isEmpty()) {
				System.out.println("No Products to take!");
				product_list.wait(); //tells that I have emptied list 
			}
		}
		
		synchronized(product_list) {
			Thread.sleep(5000);
			System.out.println("Taken product "+product_list.remove(0));
			
			product_list.notify(); //yes i have taken product from product list
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				TakeProduct();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
