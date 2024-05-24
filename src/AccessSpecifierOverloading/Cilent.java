package AccessSpecifierOverloading;

public class Cilent {
 
	
	public static void main(String[] args) {
		
		
		Parent p= new Parent();
		p.fun();
	}
}



/////
//error msg
//
//child private & parent default then error >> used final to solve this 