package PolymorphismOverloading;

public class Client {
	public static void main(String[] args) {
		
		
		Match type1= new IPL();
		type1.matchType();
		
		Match type2 = new Test();
		type2.matchType();
		
		Match type3 = new Match();
		type3.matchType();
		
		
	}

}
