package polymorphism;

public class dog extends animal{   //method overriding
	public void displayInfo() {
		System.out.println("i am dog");
	}


	public static void main(String[] args) {
		dog d1 = new dog();
		d1.displayInfo();
		
		
	
	}

}
