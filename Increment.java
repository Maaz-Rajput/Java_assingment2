class Increment {
	public static void main(String[] args) {
		int a = 5, b = 10;

		int c = a + b;
		int d = ++c;
		System.out.println("The increment is = " + d);
		int e = --c;
		System.out.println("The decrement is = " + e);
	}
}