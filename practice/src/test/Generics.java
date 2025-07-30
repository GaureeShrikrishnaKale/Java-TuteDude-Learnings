package test;

import java.util.ArrayList;
import java.util.Iterator;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Flexibility while writing code
		
		ArrayList arr = new ArrayList();
		
		arr.add("apple"); //stored as object
		arr.add("mango");
		arr.add(11);
		
		//all have type object
		
		String str = (String)arr.get(0);
		
		//java is type safe language
		
		//decreases the flexibility
		//use of E
		//can pass any complex data type in <> this ensures generics
		

		//1. generic classes
		GenericsPractice<Integer, String> gp = new GenericsPractice(1,"Gauree"); // datatype int and string 
		
		int x = gp.get1();
		String str22 = gp.get2();
		
		//2. Generic Methods
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		ArrayList<Integer> a2 = new ArrayList<>();
		a2.add(10);
		a2.add(20);
		a2.add(30);
		
		ArrayList<Integer> ans = fxn(a1, a2);
		
		Iterator<Integer> it = ans.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//3. Wildcards: concept of generics
		Object o1 = new Object();
		String string = "apple";
		o1 = string; // Object class is the parent class of all the classes in java
		
		ArrayList<Object> arr1 = new ArrayList<>();
		ArrayList<Object> arr2 = new ArrayList<>();
//		arr1 = arr2; //this is not allowed, bcoz in generics polymorphism not allowed
				//to tackle this wildcard introduced
				
		ArrayList<?> arr3 = new ArrayList<>();
		arr3 = arr2; //here added ? (any data type) to mention generic data type of arr3, allowed
		
		ArrayList<Papaya> arr4 = new ArrayList<>();
		arr3 = arr4; // this is also allowed
		
		ArrayList<? extends Fruit> arr5 = new ArrayList<>(); // any class that can only be the child class of fruit
		arr5 = arr4; //allowed
//		arr5 = arr3; //this not allowed should be child of Fruit
		
		ArrayList<? super Fruit> arr6 = new ArrayList<>(); // any class that can only be the parent class of fruit
//		arr6 = arr4; // not allowed as Papaya is the child class of Fruit not the parent class
		
		arr6 = arr1; // allowed since object is the parent class of each and every class available in java
		
		
		//;;;;;
		ArrayList<Papaya> pap = new ArrayList<>();
		
		pap.add(new Papaya());
		pap.add(new Papaya());
		fxnn(pap);
		
//		fxnn1(pap); //not allowed
		
		fxnn2(pap); // allowed as we used generic and extends
		
	}

	//2. generic methods
	public static <E> ArrayList<E> fxn(ArrayList<E>a1, ArrayList<E>a2) {
		ArrayList<E> ans = new ArrayList<>();
		ans.addAll(a1);
		ans.addAll(a2);
		return ans;
	}
	
	public static void fxnn(ArrayList<Papaya> arr) {
		for(Papaya p: arr) {
			p.eat();
		}
	}
	
	public static void fxnn1(ArrayList<Fruit> arr) {
		for(Fruit f: arr) {
			f.eat();
		}
	}
	
	public static void fxnn2(ArrayList<? extends Fruit> arr) {
		for(Fruit f: arr) {
			f.eat(); //will give error if removed eat from fruit class, will work of we use Papaya instead of fruid in for loop
		}
	}
}
