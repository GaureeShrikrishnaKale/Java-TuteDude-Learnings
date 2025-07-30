package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;

public class CollectionsFramework {
	
	public static void main(String[] args) {
		int arr[] = new int[10]; //size of array is fixed
		
		//to fix the problem of fixed sized we have collections
		
		
		//1. ArrayList: similar to array just not have fixed size
		//first an array of size 10 is made. 
		//when we try to add the 11th value in the array list
		//it doubles the original size
		ArrayList ar = new ArrayList(); //here getting yellow line, java is type safe language so giving warning as this is raw type
		ar.add("apple"); // need to define the data type of each and every variable that we use before using it in java
		ar.add("mango");
		ar.add(1);
		ar.add(2);
		ar.add(2.1);
		
//		String str = ar.get(0); //if the data ype is not explicitly give =n by us java explicitly treats it as an object, here getting issue of assigning it to the string
		String str = (String) ar.get(0); // converted the object from the array list to string
		
		Object obj = ar.get(0); // assigning the value from array list to the object instead so no conversion needed
		Object a1 = ar.get(2);
		Object a2 = ar.get(3);
//		System.out.println(a1 + a2); // cannot perform this as arithmetic operations on object are not allowed
		int a11 = (int) ar.get(2);
		int a21 = (int) ar.get(3);
		System.out.println(a11 + a21); // possible with type casting it to int
		
		//generic: way to tell java data type of array list
		ArrayList<Integer> ar1 = new ArrayList<Integer>(); //now no warning as we have given the fixed data type of integer to it  
		//we cannot add the primitive data types in it like int, string, double, need to add Integer, Double, String
		
		ar1.add(1);
		ar1.add(2);
		ar1.add(3);
		
		ar1.remove(0); //index
		System.out.println(ar1.get(0));
		
		//------->
		ArrayList<Phone> phones = new ArrayList<Phone>();
		phones.add(new Phone("Samsung","S23FE",32000));
		phones.add(new Phone("Apple","Iphone16",72000));
		phones.add(new Phone("Apple","Iphone16 Pro",92000));
		
		for(Phone phn: phones) {
			System.out.println(phn); //hash code printed if toString method is not there in the Phone Class
		}
		
		//------->
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();
		
		x.add(1);
		x.add(2);
		x.add(3);
		
		y.add(10);
		y.add(11);
		y.add(12);
		
		x.addAll(y); //all the elements of y array list will get added to x
		System.out.println(x);
		
		y.addAll(x);
		System.out.println(y);
		
		y.removeAll(x); //remove all the occurrences of x in y
		System.out.println(y);
		
		x.clear(); //Clears out the array list
		System.out.println(x);
		
		x.add(1);
		boolean isContain1 = x.contains(1); //returns if it is found,
		boolean isContain20 = x.contains(20); 
		System.out.println(isContain1 + " " + isContain20);
		
		x.add(10);
		x.add(2);
		x.add(3);
		
		y.add(10);
		y.add(11);
		y.add(12);
		
		x.retainAll(y); //just keep the elements from y
		System.out.println(x);
		
		ArrayList<Phone> array = new ArrayList<Phone>();
		array.add(new Phone("Samsung", "S23 FE", 32000));
		array.add(new Phone("Samsung", "S23", 52000));
		array.add(new Phone("Apple", "IPhone15", 62000));
		array.add(new Phone("Apple", "IPhone16", 82000));
		array.add(new Phone("Apple", "IPhone16", 82000));
		
//		Collections.sort(array); //cannot sort the object of user defined type
		//if need to work the sort on this need to add the comparable interface implements in the class
		//and implement the inherited compareTo method
		Collections.sort(array); //now can compare sort
		System.out.println(array);
		
		//2. LinkedList: 
		LinkedList<Integer> ll = new LinkedList<Integer>(); //Integer is a class similar to int data type
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		
		ll.remove(0);
		
		for(int x1: ll) {
			System.out.println(x1);
		}
		
	
		
		
		//3. List: Parent class of ArrayList and LinkedList
		
		
		//4. HashSet: Unique Values, no repeated values
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(2);
		set.add(4);
		set.add(2);
		
		//only single time added value
		
		for(Integer num: set) {
			System.out.println(num);
		}
		
		//In case of user defined classes in HashSet, in order to have uniqueness,
		//we need to add 2 additional methods in class (hashCode() and equals())
		//After adding these methods in class, the repeated entries will not get added
		HashSet<Phone> Phones = new HashSet<Phone>();
		
		Phones.add(new Phone("Samsung", "S23 FE", 32000));
		Phones.add(new Phone("Samsung", "S23", 52000));
		Phones.add(new Phone("Apple", "IPhone15", 62000));
		Phones.add(new Phone("Apple", "IPhone16", 82000));
		Phones.add(new Phone("Apple", "IPhone16", 82000));
		
		for(Phone phone : Phones) {
			System.out.println(phone);
		}
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(99);
		set1.add(187);
		set1.add(200);
		set1.add(1);
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>(set1); //converting the hashSet to arrayList
		System.out.println(arr1);
		Collections.sort(arr1); //
		System.out.println(arr1);
		
		
		//5. LinkedHashSet: if need to persist the order of entries in the HashSet then need to use LinkedHashSet
		LinkedHashSet<String> Fruites = new LinkedHashSet<String>();
		Fruites.add("Apple");
		Fruites.add("Banana");
		Fruites.add("Grapes");
		Fruites.add("Kivi");
		Fruites.add("Grapes");
		Fruites.add("Apple");
		
		//only single time added value
		
		for(String Fruite: Fruites) {
			System.out.println(Fruite);
		}
		
	
		//6. HashMap: Key, Value Pairs
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(8, "Eight");
		map.put(4, "Four");
		
		for(Integer n: map.keySet()) {
			System.out.println(n + " " + map.get(n));
		}
		
		
		//7. LinkedHashMap: If need to maintain the order of the HashMap use this.
		LinkedHashMap<Integer, String> map2 = new LinkedHashMap<Integer, String>();
		
		map2.put(1, "One");
		map2.put(2, "Two");
		map2.put(3, "Three");
		map2.put(8, "Eight");
		map2.put(4, "Four");
		
		//iterating over keys only
		for(Integer n: map2.keySet()) {
			System.out.println(n + " " + map2.get(n));
		}
		
		//map through the entries instead of keys
		for(Map.Entry<Integer, String> entry : map2.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		//8. TreeMap : Stores the values in fixed order
		
	}

}
