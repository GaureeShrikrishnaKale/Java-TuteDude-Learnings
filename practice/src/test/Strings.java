package test;

public class Strings {
	public static void main(String[] args) {
		String a = "apple";
		//String not a primitive data type
		int x = a.length();
		System.out.println(x);
		System.out.println(a.charAt(3));
		System.out.println(a.substring(1, 4));
		System.out.println(a.substring(1));
		System.out.println(a.indexOf("l"));
		System.out.println(a.indexOf("la"));
		System.out.println(a.indexOf("l", 5));
		System.out.println(a.lastIndexOf("p"));
		System.out.println(a.equals("apple"));
		System.out.println(a.equals("Apple"));
	}

}
