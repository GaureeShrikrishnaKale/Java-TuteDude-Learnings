package test;

public class javaStack {

	//2 memory locations
	//stack and heap
	
	//1. stack
	//stack frames created
	//one by one memory allocated and in LIFO memory deallocated
	
	//2. Heap
	//reference to the actual object is created is stored in heap memory
	//eg for new obj 
	//
	public static void main(String[] args) {
		double pi = 3.14; //local variable
		int x = 10; // x has the actual value bcoz int, double, boolean etc are primitive data types
		
		Smartphone sm1; //just a reference variable to the actual object
//		sm1= new Smartphone("Note10", "Samsung", 50000, 6, "Red");
		
		Processor proc1 = new Processor(); //proc1 was a reference variable which points to a processor
		
//		sm1.proc = proc1;  
		
	}
	
	
	
}
