package cab_Collection;

import java.util.ArrayList;


public class CabCustomerService {
public ArrayList<CabCustomer> customerList=new ArrayList<CabCustomer>();
public void addCabCustomer(CabCustomer customer)
{
	 
	customerList.add(customer);
	if(isFirstCustomer(customer))
	{	
		int  bill=calculateBill(-1);	
		 int k=customerList.indexOf(customer);
				customerList.get(k).setDistance(bill); 
	}
	else
	{
		int bill=calculateBill(customer.getDistance());
		int k=customerList.indexOf(customer);
		customerList.get(k).setDistance(bill);
	}
	
}
public boolean isFirstCustomer(CabCustomer customer)
{
	int count=0;
	for(int i=0;i<customerList.size();i++)
	{
	if(customerList.get(i).getPhone().equals(customer.getPhone()))
	{
		count++;
	}
	}
	if(count==1)
	{
		return true;
	}
	else
	{
		return false;
	}

}
public int calculateBill(int distance) {
	
	if(distance==-1)
	{
		return 0;
	}
   else if(distance>0&&distance<=4)
	{
		return 80;
	}
	else
	{
		return (80+6*distance);
	}
}
public  void printBill(String name,String number)
{
	for (CabCustomer customer : customerList) 
	{
        if (customer.getPhone().equals(number)&&customer.getCustid()!=-1) 
        {
             System.out.println(name+"Please pay the bill"+customer.getDistance());
             customer.setCustid(-1);
             break;
        }
     
        
    }
	    
}
}
