package try_finallyjune17;

public class FinallyBlock {
public static void main(String[] args) {
	{
		try
		{
			System.out.println("Main method started");
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println("c value is:"+c);
		}
		finally
		{
			System.out.println("Finaaly block will be executed..");
		}
		System.out.println("Main method completed");
	}
}
}
