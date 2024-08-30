package abstract_type_Program;

 abstract class Vehicle{
	public abstract void engine();
	public void sound()
	{
		System.out.println("Po Po");
	}
	
}
class Metro extends Vehicle{
    @Override
    public void engine() {
    	System.out.println("It is train");
    }
    @Override
    public void sound() {
    	System.out.println("Chuk Chuk");
    }
}

public class ConcreteMethod {
public static void main(String[] args) {
	Vehicle v=new Metro();
	v.engine();
	v.sound();
}
}
