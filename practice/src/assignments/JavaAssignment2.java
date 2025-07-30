package assignments;

public class JavaAssignment2 {
	
	public static int sum (int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Question 1:
//			Write a Java program to demonstrate the usage of return types and arguments. Create a method that takes two integers as arguments and returns their sum. Then, call this method from the main method and display the result.
//			Clarifications:
//			1. Define a method that takes two integer arguments and returns their sum.
//			2. In the main method, call the method with appropriate arguments and display the returned result.
//			3. Ensure the correct return type and arguments are used for the method.
//			Expected Output:
//			Sum of 5 and 10: 15
		
		int result = sum(5, 10);
		System.out.println("Question 1 Output : ");
		System.out.println("Sum of 5 and 10: " + result);


//		Question 2:
//			Explain the concept of 'public static void main' in Java. Write a program that demonstrates the execution of a simple 'public static void main' method, and explain its components: 'public', 'static', 'void', and 'main'.
//			Clarifications:
//			1. Define the 'public static void main' method in your program.
//			2. Explain the purpose of 'public', 'static', 'void', and 'main' in the method declaration.
//			3. Implement a simple program that outputs 'Hello, World!' using the main method.
		System.out.println("Question 2 Output : ");
//		    Explanation of public static void main:
//			Keyword	Meaning
//			public	Accessible from anywhere (required so JVM can call it).
//			static	Belongs to the class, not an object (so JVM can call it without creating an object).
//			void	No return value. The method doesn't return anything.
//			main	Entry point of every Java program. Execution starts here.
		System.out.println("Hello World!");
		
		
//		Question 3:
//			Write a Java program to demonstrate the concepts of classes, objects, and constructors. Create a class 'Student' with attributes like 'name', 'age', and 'grade'. Use a constructor to initialize these attributes, and then create an object of the class in the main method to display the student's information.
//			Clarifications:
//			1. Create a 'Student' class with attributes 'name', 'age', and 'grade'.
//			2. Define a constructor to initialize the attributes.
//			3. In the main method, create an object of the 'Student' class and display its information.
//			Expected Output:
//			Student Information:
//			Name: John Doe
//			Age: 20
//			Grade: A
		
		System.out.println("Question 3 Output : ");
		
		Student John = new Student("John Doe", 20, 'A');
		System.out.println("Student Information:"+"\n"+"Name: "+ John.name + "\n" + "Age: " + John.age + "\n" + "Grade: " + John.grade);
		
		
//		Question 4:
//			Write a Java program to demonstrate inheritance, interfaces, and method overriding. Create a superclass 'Animal' with a method 'sound'. Then, create a subclass 'Dog' that overrides the 'sound' method. Use an interface 'Playable' that defines a 'play' method, and have 'Dog' implement the 'Playable' interface.
//			Clarifications:
//			1. Create an 'Animal' class with a method 'sound'.
//			2. Create a 'Dog' class that inherits from 'Animal' and overrides the 'sound' method.
//			3. Define an interface 'Playable' with a 'play' method, and implement it in the 'Dog' class.
//			4. Demonstrate the use of inheritance and method overriding in the main method.
//			Expected Output:
//			Dog makes a sound: Woof
//			Dog can play: Yes
//
//			Submission Guidelines:
//			Create a folder on your Google Drive for the assignment.
//			Take full-screen screenshots of each task, including both the complete code and the executed output from your system's IDE (online compiler screenshots are not valid).
//			Do not crop or edit the screenshots in any way to maintain clarity.
//			Upload the full-screen screenshots into the folder.
//			After uploading the screenshots, get the shareable link to the folder.
//			Submit the shareable link in the assignment submission section.
		
		System.out.println("Question 4 Output : ");
		Dog myDog = new Dog();
		myDog.Sound();
		myDog.Play();
		


	}

}
