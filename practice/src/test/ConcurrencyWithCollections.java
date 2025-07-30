package test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrencyWithCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}

class Mine {
	List<Integer> arr = new ArrayList<Integer>();
	
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
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
