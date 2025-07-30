package assignments;

public class Dog extends Animal implements Playable{
	public void Sound() {
		System.out.println("Dog makes a sound: Woof");
	}
	
	public void Play() {
		System.out.println("Dog can play: Yes");
	}
}
