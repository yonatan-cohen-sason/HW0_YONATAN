public class HelloWorld {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		System.out.println(factorial(num));

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
