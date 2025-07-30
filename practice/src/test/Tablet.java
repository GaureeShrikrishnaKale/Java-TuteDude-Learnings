package test;

public class Tablet extends Smartphone implements Gamable{

	public Tablet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tablet(String model_name, String Brand_name, int price, int screensize_inches, String color) {
		super(model_name, Brand_name, price, screensize_inches, color);
		// TODO Auto-generated constructor stub
	}
	
	public void playGames() { //implemented the interface method
		System.out.println("To Play game on Tablet");
	}

	public void gaming() { //implemented the interface method
		System.out.println("Gaming on Tablet");
	}
}
