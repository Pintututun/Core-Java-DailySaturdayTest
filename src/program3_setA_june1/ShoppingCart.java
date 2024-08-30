package program3_setA_june1;


public class ShoppingCart {
private CartItem[] items;

public ShoppingCart(CartItem[] items) {
	
	this.items=items;
}



public void setItems(CartItem[] items) {
	this.items=items;
}

public CartItem[] getItems() {
	return items;
}

@Override
public String toString() {
	String result="Shopping Cart:\n";
	for(CartItem item:items)
	{
		result+=item+"\n";
	}
	return result;
}

}
