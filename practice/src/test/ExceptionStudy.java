package test;

public class ExceptionStudy {
	  public static void main(String[] args) {
	        Utility u = new Utility();
	        try {
	            int result = u.Multiply20(101); // 6 * 20 = 120 → Exception
	            System.out.println("Result: " + result);
	        } catch (Exception e) {
	            System.out.println("Caught exception: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }
}


