package test;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class UserInputReadingFiles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		System.out.println(str);
		
		for(int i = 0 ; i < 4 ; i++) {
			System.out.println("Enter an integer : ");
			int num = sc.nextInt();
			System.out.println(num);
		}
		sc.close();
		
		File f1 = new File("src/test/testingFileReading.txt");
		Scanner fileScanner;
		try {
			fileScanner = new Scanner(f1);
			while(fileScanner.hasNext()) {
				String s = fileScanner.next();
				System.out.println(s);
			}
			fileScanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
