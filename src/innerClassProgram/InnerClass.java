package innerClassProgram;

interface Vehicle{
	void running();
}
public class InnerClass {
public static void main(String[] args) {
	Vehicle v=new Vehicle()
			{
		public void running()
		{
			System.out.println("Running");
		}
			};
			v.running();
}
}
