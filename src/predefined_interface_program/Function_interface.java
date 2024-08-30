package predefined_interface_program;
import java.util.function.*;
public class Function_interface {
public static void main(String[] args) {
	Function<String,String> fn=new Function<String,String>()
			{
		public String apply(String name)
		{
			if(name.toLowerCase().startsWith("nit"))
				return "Yes";
			else
				return "No";
		}
			};
			System.out.println(fn.apply("NITnuresh"));
}
}
