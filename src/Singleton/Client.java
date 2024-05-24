package Singleton;

public class Client {
	public static void main(String[] args) {
		Singletone obj1 = Singletone.getObject();
		
		System.out.println("obj1");
		
		Singletone obj2= new Singletone.getObject()0;
		System.out.println(obj2);
		
		
	}

}
