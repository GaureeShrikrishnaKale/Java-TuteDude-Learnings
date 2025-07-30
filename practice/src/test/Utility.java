package test;

public class Utility {
    public int Multiply20(int val) throws Exception {
        int ans = val * 20;
        if (ans >= 100) {
//            throw new Exception("The value is greater than 100");
        	 throw new RtException("The value is greater than 100");
        }
        return ans;
    }
    
    public class RtException extends Exception {
    	public RtException(String str) {
    		super(str);
    	}
    }
}
