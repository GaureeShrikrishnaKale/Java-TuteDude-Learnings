package test;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean tired = true;
		if(tired) {
			System.out.println("Im Feeling Sleepy");
		} else {
			System.out.println("Im Feeling Energetic!");
		}
		
		
		if(5 * 2 == 9) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		//! not operator
		if(!tired) {
			System.out.println("Not");
		} else {
			System.out.println("Yes");
		}
		
		int marks = 82;
		 if(marks >= 95) {
			 System.out.println("A+");
		 } else if(marks >= 85) {
			 System.out.println("A");
		 } else if(marks >= 70) {
			 System.out.println("B+");
		 } else {
			 System.out.println("B");
		 }
		 
		// nested if-else
		 
		 int num = 8;
		 if(num >= 5) {
			 if(num > 6) {
				 System.out.println("Big Num");
			 } else {
				 System.out.println("num is either 5 or 6");
			 }
		 }
		 
		 
	}

}
