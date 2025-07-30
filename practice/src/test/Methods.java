package test;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World!");
		//println is a method, and hello world is an argument
		
//		MethodsNew.PrintSomething(); //calls the method. This was a method without an argument
		
		//calling a method : executing lines inside the method 
		
		MethodsNew.PrintSomething("Gauree");
		MethodsNew.PrintSomething(24);
		
		MethodsNew.Multiply(100, 4);
		
		int result = MethodsNew.multiply100(20);
		System.out.println("Result: " + result );
	}
	
//	public static void PrintSomething() {
//		System.out.println("Something!");
//	}
//	
//	public static void PrintSomething(String name) {
//		System.out.println("Something!" + name);
//	}


}
