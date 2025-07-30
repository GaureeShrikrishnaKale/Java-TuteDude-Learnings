package assignments;

public class JavaAssignment1 {

	public static void main(String[] args) {
		
//		Question 1:
//			Write a Java program that demonstrates the use of variables and data types. The program should use variables of different data types (int, double, char, boolean, String) and perform basic operations such as addition, subtraction, multiplication, and string concatenation.
//			Clarifications:
//			1. Declare variables of different data types (e.g., int, double, char, boolean, String).
//			2. Perform basic arithmetic operations using numeric data types (int and double).
//			3. Concatenate strings using the String variable and display the result.
//			4. Display the results of all operations.
//			Expected Output:
//			Integer result of addition: 20
//			Double result of division: 15.5
//			Character: A
//			String concatenation result: Hello, world!
		// Declare variables
        int a = 10;
        int b = 10;
        int intSum = a + b; // Integer addition

        double x = 31.0;
        double y = 2.0;
        double doubleDiv = x / y; // Double division

        char grade = 'A'; // Character

        boolean isJavaFun = true; // Boolean

        String greeting = "Hello, ";
        String world = "world!";
        String message = greeting + world; // String concatenation

        // Output results
        System.out.println("Integer result of addition: " + intSum);
        System.out.println("Double result of division: " + doubleDiv);
        System.out.println("Character: " + grade);
        System.out.println("Boolean value: " + isJavaFun);
        System.out.println("String concatenation result: " + message);
        
//        Question 2:
//        	Write a Java program that creates an array of integers and performs the following operations: - Assign values to the array
//        	- Find the sum and average of the array elements
//        	- Find the largest and smallest element in the array
//        	Clarifications:
//        	1. Create an array of integers.
//        	2. Assign values to the array using a loop or direct initialization.
//        	3. Calculate the sum and average of the array elements.
//        	4. Find and display the largest and smallest elements in the array.
//        	Expected Output:
//        	Array elements: 10, 20, 30, 40, 50
//        	Sum of array elements: 150
//        	Average of array elements: 30
//        	Largest element: 50
//        	Smallest element: 10
        
        int[] numbers = {10,20,30,40,50};
        
        int sum = 0;
        int average = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        
        for(int i = 0 ; i < numbers.length ; i++) {
        	sum = sum + numbers[i];
        	largest = Math.max(largest, numbers[i]);
        	smallest = Math.min(smallest, numbers[i]);
        }
        
        average = sum / numbers.length;
        
        // Display array elements
        System.out.print("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Output results
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
        
//        Question 3:
//        	Write a Java program that uses If-Else and Nested If-Else statements to determine whether a person is eligible for voting. A person is eligible to vote if their age is greater than or equal to 18. Additionally, if the age is above 18, check whether the person has valid identification to vote. Use nested If-Else to handle these conditions.
//        	Clarifications:
//        	1. Use an If-Else statement to check if the person's age is 18 or greater.
//        	2. If the person is eligible (age >= 18), use a nested If-Else to check if they have valid identification.
//        	3. Display appropriate messages based on the conditions (eligible, not eligible, or missing ID). Use hardcoded input values and check all the cases of eligible, not eligible, and missing ID !
	        
        int age = 28;
        boolean has_ID = false;
        
        if (age >= 18) {
            if (has_ID) {
                System.out.println("You are eligible to vote and you have valid ID.");
            } else {
                System.out.println("You are eligible to vote but you must bring valid ID.");
            }
        } else {
            System.out.println("You are not eligible to vote.");
        }

	}

}
