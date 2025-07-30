package assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class JavaAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Java Programming Assignment 3
//		Question 1:
//		Write a Java program that demonstrates user input and file handling. The program should prompt the user to enter their complete name (the student should enter his/her first and last name) and a text file name, append the complete name to the specified file content, read the file's content, and display it on the console.
//		Clarifications:
//		1. Use the Scanner class to read user input for the file name.
//		2. Append your complete name to the specified file, then read and display the file's content on the console.
//		3. Handle any possible errors, such as file not found or input mismatch exceptions.
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Please Enter Your First Name: ");
//		String firstName = sc.nextLine();
//		
//		System.out.println("Please Enter Your Last Name: ");
//		String lastName = sc.nextLine();
//		
//		System.out.println("Please Enter File Name: ");
//		String fileName = sc.nextLine();
//		
//		sc.close();
//		
//		File file = new File("src/assignments/" + fileName + ".txt");
//		try {
//			FileWriter writer = new FileWriter(file, true);
//			writer.write(firstName + " " + lastName + "\n");
//			writer.close();
//			System.out.println("Name appended to file successfully");
//		} catch(IOException e) {
//			System.out.println("Error writing to file: " + e.getMessage());
//			return;
//		}
//		
//		try {
//			Scanner fileScanner = new Scanner(file);
//			System.out.println("File Contents: ");
//			while(fileScanner.hasNext()) {
//				String line = fileScanner.nextLine();
//				System.out.println(line);
//			}
//			fileScanner.close();
//		} catch (FileNotFoundException e) {
//			System.out.println("File Not Found ! " + e.getMessage());
//		}
		
//		Question 2:
//		Write a Java program that demonstrates the use of exceptions for error handling. The program should handle a divide by zero exception and display an appropriate message.
//		Clarifications:
//		1. Implement try-catch blocks to handle exceptions.
//		2. Simulate a division by zero operation and catch the ArithmeticException.
//		3. Display 'Division by zero is not possible' if a division by zero occurs.
//		Expected Output:
//		Enter numerator: 10
//		Enter denominator: 0
//		Division by zero is not possible.
		
//		try {
//			Scanner sc1 = new Scanner(System.in);
//			System.out.println("Trying to perform division by zero");
//			System.out.println("Enter numerator: ");
//			Integer numerator = sc1.nextInt();
//			
//			System.out.println("Enter denominator: ");
//			Integer denominator = sc1.nextInt();
//			
//			Integer Solution = numerator / denominator;
//			System.out.println(Solution);
//			
//		} catch(ArithmeticException e) {
//			System.out.println("Division by zero is not possible" + e.getMessage());
//		}
		
//		Question 3:
//		Write a Java program that demonstrates BufferedReader for reading input from the user. The program should read a user's name and age, then display them in a message.
//		Clarifications:
//		1. Use BufferedReader to read user input for name and age.
//		2. Use the readLine() method to read strings and the parseInt() method to read integers.
//		3. Display the user's name and age in a formatted message.
//		Expected Output:
//		Enter your name: John Doe
//		Enter your age: 30
//		Hello, John Doe! You are 30 years old.
		
//		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			
//			System.out.println("Enter your name: ");
//			String name = br.readLine();
//			
//			System.out.println("Enter your age: ");
//			Integer age = Integer.parseInt(br.readLine());
//			
//			System.out.println("Hello, " + name + "! You are " + age + " years old.");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Error reading input: " + e.getMessage());
//		} catch(NumberFormatException e) {
//			System.out.println("Invalid age format. Please enter a valid number.");
//		}
//		
		
		
		
//		Question 4:
//		Write a Java program that demonstrates the use of ArrayLists, LinkedLists, and HashSet from the Collections Framework. The program should add elements to each of these collections and display them.
//		Clarifications:
//		1. Create an ArrayList and add a few elements. Display the ArrayList.
//		2. Create a LinkedList, add elements, and display the LinkedList.
//		3. Create a HashSet, add elements, and display the HashSet.
//		4. Explain the differences between ArrayList, LinkedList, and HashSet.
		
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(50);
		arraylist.add(40);
		
		System.out.println("Displaying Array List: ");
		for(Integer num : arraylist) {
			System.out.println(num);
		}
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Gauree");
		linkedlist.add("Gargee");
		linkedlist.add("Vidya");
		linkedlist.add("Vishnu");
		
		System.out.println("Displaying Linked List: ");
		for(String str : linkedlist) {
			System.out.println(str);
		}
		
		HashSet<Integer> hashset = new HashSet<Integer>();
		hashset.add(10);
		hashset.add(20);
		hashset.add(10);
		hashset.add(20);
		hashset.add(50);
		hashset.add(20);
		
		System.out.println("Displaying Hash Set");
		for(Integer num : hashset) {
			System.out.println(num);
		}
		
		/*
		-------------------- Differences --------------------

		1. ArrayList:
		   - Implements List interface using a dynamic array.
		   - Maintains insertion order.
		   - Allows duplicate elements.
		   - Provides fast access using index (get/set).
		   - Slower at inserting or deleting elements in the middle.

		2. LinkedList:
		   - Implements List interface using a doubly linked list.
		   - Maintains insertion order.
		   - Allows duplicates.
		   - Slower access by index (no random access).
		   - Faster insertions/deletions at the beginning/middle.

		3. HashSet:
		   - Implements Set interface using a hash table.
		   - Does NOT maintain insertion order.
		   - Does NOT allow duplicate elements.
		   - Provides fast add/remove/lookup.
		   - Best used when unique elements are needed without caring about order.

		------------------------------------------------------
		*/

//
//		Submission Guidelines:
//		Create a folder on your Google Drive for the assignment.
//		Take full-screen screenshots of each task, including both the complete code and the executed output from your system's IDE (online compiler screenshots are not valid).
//		Do not crop or edit the screenshots in any way to maintain clarity.
//		Upload the full-screen screenshots into the folder.
//		After uploading the screenshots, get the shareable link to the folder.
//		Submit the shareable link in the assignment submission section.


	}

}
