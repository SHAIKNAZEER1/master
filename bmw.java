package oops;

public class bmw extends car{  //concrete class
	
	@Override
	void accelerate() {    //implement accelerate method
		System.out.println("bmw::accelerate");		
	}


	public static void main(String[] args) {
		car obj = new bmw();
		obj.accelerate();  //call the method
		

	}
	
	}

