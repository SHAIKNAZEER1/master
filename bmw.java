package inher;

public class bmw extends car {  //  sub class
	
	private String bodyStyle;  //private feilds
	
	

	public bmw(String make, String color, int year, String model, String bodyStyle) {
	super(make, color, year, model);
	this.bodyStyle = bodyStyle;  //calling super class constutor
}
	public void bmwDetails() {  //details of bmw
		printDetails();  //calling method from super class
		System.out.println("bodyStyle:"+bodyStyle);
	}



	

}
