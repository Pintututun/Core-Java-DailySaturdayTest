package cab_Collection;

public class CabCustomer {
private int custid;
private String customerName;
private String pickupLocation;
private String dropLocation;
private int distance;
private String phone;


public CabCustomer(int custid, String customerName, String pickupLocation, String dropLocation, int distance,
		String phone) {
	super();
	this.custid = custid;
	this.customerName = customerName;
	this.pickupLocation = pickupLocation;
	this.dropLocation = dropLocation;
	this.distance = distance;
	this.phone = phone;
}
public int getCustid() {
	return custid;
}
public void setCustid(int custid) {
	this.custid = custid;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getPickupLocation() {
	return pickupLocation;
}
public void setPickupLocation(String pickupLocation) {
	this.pickupLocation = pickupLocation;
}
public String getDropLocation() {
	return dropLocation;
}
public void setDropLocation(String dropLocation) {
	this.dropLocation = dropLocation;
}
public int getDistance() {
	return distance;
}
public void setDistance(int distance) {
	this.distance = distance;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}


}
