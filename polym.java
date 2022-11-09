package polymorphism;

public class polym {

	public static void main(String[] args) {
		cashpayment c = new cashpayment();
	    c.pay();
	    
	     Payment p = new cashpayment();
	     p.pay();
	      
	     p = new creditpayment();
	     p.pay();

	}

}
