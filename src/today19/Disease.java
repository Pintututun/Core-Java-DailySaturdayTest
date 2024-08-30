package today19;

public class Disease implements Hospital {

	@Override
	public void admit() {
		// TODO Auto-generated method stub
		System.out.println("Disease.admit()");

	}

	@Override
	public void treatment() {
		// TODO Auto-generated method stub
		System.out.println("Disease.treatment()");

	}

	@Override
	public void bill() {
		// TODO Auto-generated method stub
		System.out.println("Disease.bill()");

	}
	
	public void diseaseNotAvailable() {
		System.out.println("Disease.diseaseNotAvailable()");
		
	}

}
