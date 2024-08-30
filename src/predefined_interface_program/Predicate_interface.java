package predefined_interface_program;

import java.util.Scanner;
import java.util.function.Predicate;

public class Predicate_interface {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the name to check whether the length is greater than 15 or not-");
	String nam=sc.nextLine();
	Predicate<String> pi=new Predicate<String>()
			{
		public boolean test(String name)
		{
			if(name.length()>15)
			{
				return true;
			}
			else
				return false;
		}
			};
			System.out.println(pi.test(nam));
}
}
