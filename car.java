package inher;

public class car {  //base class
	
	private String make ;  //private feilds
	private String color;
	private int year;
	private String model;
	
	
	
	public car(String make, String color, int year, String model) {
		super();
		this.make = make;
		this.color = color;
		this.year = year;
		this.model = model;  //parameterized constructor
	}
	/*public car(String string, String string2, int i, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}*/
	public void printDetails() {
		System.out.println("manufacture:"+make);
		System.out.println("color:"+color);
		System.out.println("year:"+year);
		System.out.println("model:"+model);
	}
	/*public void bmwDetails() {
		// TODO Auto-generated method stub
		
	}*/
	
	

}
