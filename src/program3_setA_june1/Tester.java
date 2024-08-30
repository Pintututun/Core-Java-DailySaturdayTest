package program3_setA_june1;

import java.util.Scanner;
import java.util.function.Consumer;

public class Tester {
public static void main(String[] args) {
	Consumer<ShoppingCart> discount=new Consumer<ShoppingCart>()
			{
		
		double totalPrice=0;
		public void accept(ShoppingCart sc)
		{
			for(CartItem item:sc.getItems())
			{
				totalPrice+=item.getTotalPrice();
			}
			if(totalPrice>1000000)
			{
				totalPrice*=0.9;
				System.out.println("Discount appliesd:"+totalPrice);
			}
			else
			{
				System.out.println("No discount applied: "+totalPrice);
			}
		}
			};
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter your choice");
			int i=-1;
			CartItem[] items = new CartItem[scan.nextInt()];
			char option='Y';
			while(option=='y'||option=='Y')
			{
				i++;
				scan.nextLine();
			System.out.print("Enter the product--");
			String pro=scan.nextLine();
			System.out.print("Enter the price--");
			double price=scan.nextDouble();
			System.out.print("Enter the quantity--");
			int quantity=scan.nextInt();
			CartItem item1=new CartItem(pro, price,quantity);
			items[i]= item1;
			System.out.print("Do you want to continue Press y for yes or n for no-");
			 option=scan.next().charAt(0);
			}
			ShoppingCart sc=new ShoppingCart(items);
			System.out.println(sc);
			discount.accept(sc);
}
}
