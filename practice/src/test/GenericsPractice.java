package test;

public class GenericsPractice<i1,i2> {
	
	i1 num1;
	i2 num2;
	
	public GenericsPractice(i1 num1, i2 num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public i1 get1() {
		return num1;
	}
	
	public i2 get2 () {
		return num2;
	}
	
	public void add() {
		System.out.println(num1);
	}
	
	
	

}
