package test;
import java.time.LocalTime;

public class SmartWatch extends Smartphone {
	//go to source and options then will get auto generation options

	public SmartWatch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SmartWatch(String model_name, String Brand_name, int price, int screensize_inches, String color) {
		super(model_name, Brand_name, price, screensize_inches, color);
		// calls the constructor of the Smartphone
		// TODO Auto-generated constructor stub
	}
	
	public void seeTime() {
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
	}
	
	public void playGames() { //method overriding
		System.out.println("Cannot Play Games on SmartWatch!");
	}

	
	public void gaming() { //method overriding
		System.out.println("Cannot gaming on SmartWatch!");
	}

	
	
}
