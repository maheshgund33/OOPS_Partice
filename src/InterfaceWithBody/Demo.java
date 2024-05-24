package InterfaceWithBody;

public interface Demo {
	 
	static void fun() {                              //static or default for put body inside interface
		System.out.println("Interface has body ");
	}
	
	//OR
	
	default void gun() {                              //static or default for put body inside interface
		System.out.println("Interface has body ");
	}
}
