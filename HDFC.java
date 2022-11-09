package bank;

public class HDFC extends Bank{

	@Override
	int getIntrestRate() {
		
		return 5;
	}
	public static void main(String[] args) {
		Bank b ;   
		b = new ICICI();  //concrete class object
		System.out.println("ICICI rate of intrest is:"+b.getIntrestRate()+"%" );
		
		b = new HDFC();  //concrete class object
		System.out.println("HDFC rate of intrest is:"+b.getIntrestRate()+"%" );
	
	}

}
