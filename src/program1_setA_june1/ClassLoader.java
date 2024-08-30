package program1_setA_june1;

import java.util.Scanner;

public class ClassLoader {
public static void main(String[] args) throws ClassNotFoundException {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the class name-");
	String nam=sc.nextLine();
	Class name=Class.forName(nam);
	System.out.println("Loaded by:"+name.getClassLoader().getName());
	System.out.println("Loaded by:"+ClassLoader.class.getClassLoader().getParent());
	System.out.println("class name-"+name.getName());
}
}
