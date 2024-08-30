package saturdaytest_may30;

interface A {
	 void m1();
	}

	public class B implements A {

	@Override
	public void m1(){
	  System.out.print("One"+" "); 	
	 }
	void m2() {
	System.out.print("Two"+" ");
	}
	public static void main(String [] args) {
	A a = new B();
	a.m1(); 
	new B().m2();
	}
	}
