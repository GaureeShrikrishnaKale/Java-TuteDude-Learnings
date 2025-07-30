package test;

public class Gadgets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Smartphone phone1;
//		phone1 = new Smartphone();
		
//		phone1.model_name = "S23FE";
//		phone1.Brand_name = "Samsung";
//		phone1.price = 32000;
//		phone1.color = "Lemon Green";
//		phone1.screensize_inches = 6;
//		
//		phone1.TurnOff();
//		phone1.Details();
		
//		Smartphone phone2 = new Smartphone(); //creating object of abstract class is not allowed
		
//		phone2.model_name="Iphone15";
//		phone2.Brand_name = "Apple";
//		phone2.price = 82000;
//		phone2.color = "White";
//		phone2.screensize_inches = 5;
//
//		phone2.TurnOff();
//		phone2.Details();
		
//		Smartphone phone3 = new Smartphone("Note 10", "Samsung", 60000, 6, "Black");
//		phone3.Details();
		//phone3.seeTime(); cannot access the child class methods
		
		SmartWatch wtch1 = new SmartWatch("Iwatch", "Apple", 30000, 2, "Black");
		
		wtch1.TurnOn();
		wtch1.seeTime();
		wtch1.playGames();
		
		Tablet t1 = new Tablet("Itab", "Apple", 80000, 2, "Black");
		t1.playGames();
		
		
		Smartphone wtch = new SmartWatch("Iwatch11", "Apple", 30000, 2, "Black"); 
	}

}
