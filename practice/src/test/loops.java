package test;

public class loops {
	//to execute a piece of code again and again
	public static void main(String[] args) {
	//for loop
	for(int i = 0 ;i < 50 ; i++) {
		System.out.println("GSK from for here");
		if(i == 5)
			break;
	}
	
	//while loop
	int count = 0;
		while(count < 50) {
			System.out.println("GSK here");
			count = count + 1;
			
			if(count == 5) {
				break;
			}
		}
		
	//nested loops
		//loop inside loop
		
	}

}
