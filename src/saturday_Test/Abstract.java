package saturday_Test;

class NiT
{
	protected void nit() 
	{
		System.out.println("NIT");
	}
}

class NiT1 extends NiT
{
	protected void nit() 
	{
		System.out.println("HI....");
	}
}
public class Abstract extends NiT1{

	public static void main(String[] args) {
		NiT n=new NiT1();
		n.nit();
	}
}
