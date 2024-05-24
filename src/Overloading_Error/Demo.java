package Overloading_Error;

public class Demo {
	
 void fun(int x, float y) {
	 System.out.println(" overloading method");
 }
 
 void fun(float x, int y) {
	 System.out.println(" Overloading 2 method");
          }
 
 
 public static void main(String[] args)){
	Demo db= new Demo();
	db.fun(10, 10.5);
	db.fun(12.5, 15);
   }

}


// error ambuity 