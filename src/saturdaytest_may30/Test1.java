package saturdaytest_may30;

class Test1 {
	static void go(Byte x, Byte y) {
		System.out.println("Byte, Byte");
	}
	static void go(byte... x) {
		System.out.println("byte... ");
	}
	public static void main(String[] args) {
		byte b = 25;
		go(b, b); 
	}
}
