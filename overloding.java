package polymorphism;

public class overloding {
	public void display() {
		System.out.println("display method");
		
	}

	public static void main(String[] args) {
		overloding obj = new overloding();
		obj.display();
		obj.display(11);
		

	}

	private void display(int i) {
		System.out.println("display value:" + i);
		
	}

}
