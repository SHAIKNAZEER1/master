package inher;

public class worker extends employe{
	int bonus = 50000;
	

	public static void main(String[] args) {
	worker w = new  worker();
	System.out.println("worker salary is :"+ w.salary);
	System.out.println("bonus of worker :"+ w.bonus);
			

	}

}
