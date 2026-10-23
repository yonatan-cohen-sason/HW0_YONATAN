public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("This is hello YYYZZZ  from Yonatan");

		int a = 1;
		a = a + 1;
		System.out.println(a);
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static int nth_fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		return nth_fibonacci(n - 1) + nth_fibonacci(n - 2);
	}
}
