package polymorphism;

public class staticnumber {
	void sum(int x,int y) {
		int z = x+y;
		System.out.println("sum of two numbers:" + z);
		
	}
	void sum(int x,int y,int z) {
		int s =x+y+z;
		System.out.println("sum of three numbers:"+ s);
	}
	public static void main(String[] args) {
		staticnumber obj = new staticnumber(); 
		obj.sum(10, 20);
		obj.sum(10, 20, 30);

}
}