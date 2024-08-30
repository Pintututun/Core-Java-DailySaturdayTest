package predefined_interface_program;

public class Product {
String productName;
int productId;
String productManufacturingDate;
String productExpiryDate;
double price;
public Product(String productName, int productId, String productManufacturingDate, String productExpiryDate,
		double price) {
	super();
	this.productName = productName;
	this.productId = productId;
	this.productManufacturingDate = productManufacturingDate;
	this.productExpiryDate = productExpiryDate;
	this.price = price;
}
@Override
public String toString() {
	return "Product [productName=" + productName + ", productId=" + productId + ", productManufacturingDate="
			+ productManufacturingDate + ", productExpiryDate=" + productExpiryDate + ", price=" + price + "]";
}

}
