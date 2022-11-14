import java.util.*;  
public class ArrayList{  
public static void main(String args[]){  
ArrayList list=new ArrayList();//Creating ArrayList  
list.add("Ravi");//Adding object in ArrayList  
list.add("Vijay");  
list.add("Ravi");  
list.add("Ajay");  
//Traversing list through Iterator  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}

private Iterator iterator() {
	// TODO Auto-generated method stub
	return null;
}

private void add(String string) {
	// TODO Auto-generated method stub
	
}  
}