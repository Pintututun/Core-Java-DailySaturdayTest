package impquestions;

class Product {
	int x;
	int y;
	public Product() {
		this.x = x;
		this.y = y;
	}
	public void call() {
		System.out.println("call method called");
	}
}
public class Test14 {
	public static void main (String[] args) {
		Product p = new Product();
		p.call();
	}
}