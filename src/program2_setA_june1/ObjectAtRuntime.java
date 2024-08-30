package program2_setA_june1;

import java.util.Scanner;

class ObjectAtRuntime 
{	
   public static void main(String [] args) throws Exception
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the name of class-");
	   String name=sc.nextLine();
      Object obj =   Class.forName(name).newInstance();
      Class cls = obj.getClass();
      System.out.println("Class at run time-"+cls.getSimpleName());
      System.out.println("Object created for ="+name);
  	}
}
