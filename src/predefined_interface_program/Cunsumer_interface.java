package predefined_interface_program;
import java.util.function.*;
import java.util.Scanner;
public class Cunsumer_interface {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the name to find the length-");
	String nam=sc.nextLine();
	Consumer<String> con=new Consumer<String>()
			{
		public void accept(String name)
		{
			System.out.println(name.length());
		}
			};
			con.accept(nam);
}
}
