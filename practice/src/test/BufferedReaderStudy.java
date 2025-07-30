package test;
import java.io.*;

public class BufferedReaderStudy {
	public static void main(String[] args) {
		
		
		File f1 = new File("src/test/testingFileReading.txt");
		BufferedReader bf = null;
		
		//finally is only used to close the resources
		try {
			FileReader fr = new FileReader(f1);
			bf = new BufferedReader(fr);
			
			String f = bf.readLine();
			
			while(f!= null) {
				System.out.println(f);
				f = bf.readLine();
			}
		} catch (FileNotFoundException e){
			System.out.println("File Not Found Exception");
		} catch (IOException e) {
			System.out.println("IO Exception");
		} finally {
			try {
				bf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//If not to add finally have auto closable interface (introduced in java 7)
		try (FileReader fr = new FileReader(f1);
				BufferedReader bfr = new BufferedReader(fr);) {
			
			String f = bfr.readLine();
			
			while(f!= null) {
				System.out.println(f);
				f = bfr.readLine();
			}
		} catch (FileNotFoundException e){
			System.out.println("File Not Found Exception");
		} catch (IOException e) {
			System.out.println("IO Exception");
		}
	}

}
