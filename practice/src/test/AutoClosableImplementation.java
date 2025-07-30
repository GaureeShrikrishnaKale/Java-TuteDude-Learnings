package test;

public class AutoClosableImplementation {
	
	public static void main(String[] args) {
		
		try(Apple a1 = new Apple();) {
			
		} catch(Exception e) {
			System.out.println("Caught the exception");
		}
	}

}
