package saturdaytest_may30;

class Exam {
	static void accept(int x) {
		System.out.println("int...");
	}

	static void accept(Integer... x) {
		System.out.println("Integer...");
	}
	static void accept(Object... x) {
		System.out.println("Object...");
	}

	public static void main(String[] args) {
		int i = 5;
		accept(i, i);  
	}
}

