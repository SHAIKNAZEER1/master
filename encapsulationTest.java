package encapsulation;

public class encapsulationTest {

	public static void main(String[] args) {
		student obj = new student();
		 //obj.name = "sri";
		obj.setName("sri");
		String studentName = obj.getName(); 
		System.out.println(studentName);
		

	}

}
