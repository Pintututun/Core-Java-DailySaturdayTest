package testSaturday_Aug26;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;




public class StoreObject implements Serializable {
 public static void main(String[] args) throws IOException {
	 FileOutputStream fout = new FileOutputStream("D:\\Player.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		Scanner sc = new Scanner(System.in);
		try(fout; oos; sc)
		{
			System.out.print("How many Objects you want to write :");
			int numberOfObjects = sc.nextInt();
			
			for(int i=1; i<=numberOfObjects; i++)
			{
				Player p = Player.getPlayerObject();
				oos.writeObject(p);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Object stored in the file successfully!!!!");
}
}
