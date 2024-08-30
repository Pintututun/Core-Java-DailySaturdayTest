package program3_setA_june1;

public class CartItem {
private String name;
private double price;
private int quantity;
public CartItem(String name, double price, int quantity) {
	super();
	this.name = name;
	this.price = price;
	this.quantity = quantity;
}
protected String getName() {
	return name;
}
protected void setName(String name) {
	this.name = name;
}
protected double getPrice() {
	return price;
}
protected void setPrice(double price) {
	this.price = price;
}
protected int getQuantity() {
	return quantity;
}
protected void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getTotalPrice()
{
	return quantity*price;
}
@Override
public String toString() {
	return "name= " + name + ", quantity=" + quantity + " ,price= "+price+" and Total Price--"+getTotalPrice();
}

}
