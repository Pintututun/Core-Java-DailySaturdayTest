package predefined_interface_program;
import java.util.function.*;
import java.util.Scanner;

public class Supplier_interface {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the product name-");
	String pname=sc.nextLine();
	System.out.print("Enter the product id-");
	int pid=sc.nextInt();sc.nextLine();
	System.out.print("Enter the product manufacturing date-");
	String mdate=sc.nextLine();
	System.out.print("Enter the product expiry date-");
	String edate=sc.nextLine();
	System.out.print("Enter the product price-");
	double pprice=sc.nextDouble();
	Supplier<Product> su=new Supplier<Product>()
			{
		public Product get()
		{
			return new Product(pname, pid, mdate, edate, pprice);
		}
			};
			Product p1=su.get();
			System.out.println(p1);
}
}
