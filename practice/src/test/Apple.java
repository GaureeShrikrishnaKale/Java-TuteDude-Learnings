package test;

public class Apple implements AutoCloseable {
	
	@Override
	public void close() throws Exception {
		System.out.println("Closing all the resources");
	}
	
}
