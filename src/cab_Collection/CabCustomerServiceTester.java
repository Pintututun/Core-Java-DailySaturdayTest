package cab_Collection;


import java.util.Random;


public class CabCustomerServiceTester {

	public static void main(String[] args) {
		Random ram=new Random();
		
		CabCustomer cab1=new CabCustomer(ram.nextInt(),"John","Delhi","Mumbai",4,"7904391700");
		CabCustomer cab=new CabCustomer(ram.nextInt(),"John","Delhi","Mumbai",4,"7904391700");
		CabCustomer cab2=new CabCustomer(ram.nextInt(),"Martin","Jajpur","Mumbai",10,"7904391700");
		CabCustomer cab3=new CabCustomer(ram.nextInt(),"Tina","Odisha","Telegana",100,"9861233752");
		CabCustomer cab4=new CabCustomer(ram.nextInt(),"Karan","Odisha","Telegana",120,"9861233752");
		CabCustomerService  service=new CabCustomerService();
		
		service.addCabCustomer(cab1);
		service.addCabCustomer(cab2);
		service.addCabCustomer(cab3);
		service.addCabCustomer(cab4);
		service.addCabCustomer(cab);
        for(CabCustomer cus:service.customerList)
        {
        	
        	System.out.print(cus.getCustid());
        	System.out.print(cus.getCustomerName());
        	System.out.print(cus.getDistance());
        	System.out.print(cus.getDropLocation());
        	System.out.print(cus.getPickupLocation());
        	System.out.print(cus.getPhone());
        	System.out.print("\n_____________________________\n");
        	
        }
        System.out.println();
		service.printBill("John","7904391700");
		System.out.println();
		service.printBill("John","7904391700");
		System.out.println("______________________");
		service.printBill("Martin","7904391700");
		System.out.println("______________________");
		service.printBill("Tina","9861233752");
		System.out.println("______________________");
		service.printBill("Karan","9861233752");
		System.out.println("______________________");
		
		

	}

}
