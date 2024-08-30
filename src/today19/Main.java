package today19;

public class Main {

	public static void main(String[] args) {
		int option=4;
		switch(option)
		{
		case 1:Hospital hos=new Cardiologist();
		hos.admit();
		hos.treatment();
		hos.bill();
		break;
		case 2:Hospital hos1=new Orthopedic();
		hos1.admit();
		hos1.treatment();
		hos1.bill();
		break;
		case 3:Hospital hos2=new Pediatric();
		hos2.admit();
		hos2.treatment();
		hos2.bill();
		
		default:Hospital dis=new Disease();
		dis.diseaseNotAvailable();
		}
		

	}

}
