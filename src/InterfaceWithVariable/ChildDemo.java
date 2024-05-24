package InterfaceWithVariable;

public class ChildDemo implements A,B{
	int x=30;
	
	void fun() {
		System.out.println(x);  //30
		System.out.println(A.x); //10 
		System.out.println(B.y); //20
	}

}
