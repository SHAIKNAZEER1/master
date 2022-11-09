
public class javaexception {

	public static void main(String[] args) {
		
		try{
			int data = 100/0;  // ArithmeticException
			}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code");
		
		String s = null;
        System.out.println(s.length());  // NullPointerException
        
        
        String s1 = "abc";
        int i = Integer.parseInt(s1);
		 
		
	}
	
}

/*public class NumberFormatException {

	
	public static void main(String[] args) {
		try {
			new NumberFormatException().intParsingMethod();
		}

		catch (NumberFormatException e) {
			System.out.println("we can catch the NumberFormatException ");
			
		}
	
	 

	}

	public void intParsingMethod() throws NumberFormatException  {
		int x = Integer.parseInt("10k");
		System.out.println(x);
		
	}
	

}*/

	
