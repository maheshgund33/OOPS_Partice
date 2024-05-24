package Singleton;

public class Singletone {
	
	static Singletone obj= new Singletone();
	private Singletone() {
		System.out.println(" Constructor");
	}
	
	Static Singletone getObject() {
		return obj;
	}

}
