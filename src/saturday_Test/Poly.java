package saturday_Test;

public class Poly {

	public static void nit(int a) 
	{
		System.out.println(a +"Int");
	}
	
	public static void nit(String b) 
	{
		System.out.println(b+" String");
	}
	
	public static void nit(Object c) 
	{
		System.out.println(c+" Object");
	}
	
	public static void main(String[] args) {
		nit(null);
	}
}
