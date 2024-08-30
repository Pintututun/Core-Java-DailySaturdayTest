package impquestions;

class employee{
 	 String name;
 	public employee(String name) {
  		this.name=name;  
 	}
}
public class Test16 {
 	public static void main(String[] Java) {
  		employee e = new employee("JavaDeveloper");
  		System.out.println("Emp Name : "+e.name);
 	}
}
