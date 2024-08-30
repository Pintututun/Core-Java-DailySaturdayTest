package staticOverriding;

class Super
{
 public static void accept()
 {
	 System.out.println("1");
 }
}
class Sub extends Super
{
	public static void accept()
	{
		System.out.println("2");
	}
}
public class Main {
	public static void main(String[] args) {
		Super s1=new Sub();
		s1.accept();
		Sub s2=new Sub();
		s2.accept();
	}

}
