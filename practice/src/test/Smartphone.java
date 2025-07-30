package test;

public abstract class Smartphone {
	
	String model_name;
	String Brand_name;
	int price;
	int screensize_inches;
	String color;
	Processor proc;
	
	public Smartphone() {
		//constructor in java
		model_name = "S23FE";
		Brand_name = "Samsung";
		price = 32000;
		color = "Lemon Green";
		screensize_inches = 6;
	}
	
	public Smartphone(String model_name, String Brand_name, int price, int screensize_inches, String  color) {
		//constructor in java
		this.model_name = model_name;
		this.Brand_name = Brand_name;
		this.price = price;
		this.color = color;
		this.screensize_inches = screensize_inches;
	}
	
	public void Details() {
		System.out.println("Model Name" + model_name);
		System.out.println("Brand Name" + Brand_name);
		System.out.println("Price" + price);
	}
	
	public void TurnOn() {
		System.out.println("Turning On");
	}
	
	public void TurnOff() {
		System.out.println("Turning Off");
	}
	
	public void Call() {
		System.out.println("Making a call");
	}
	
	public void playGames() {
		System.out.println("Playing Game on a SmartPhone!");
	}
	
	//abstract method
	public abstract void gaming();

}
