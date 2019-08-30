public class Practice01MathIterative implements Practice01Math {

	public int fib(int n) {
		int a = 0;
		int b = 1;
		int c = 1;
		if (n >= 0) {
			for (int i = 0; i < n; i++) {
				a = b;
				b = c;
				c = a + b;
			}
		} else {
			throw new IllegalArgumentException("No negative numbers allowed.");
		}

		return a;

	}

	public int fact(int n) {
		int fact = 1;

		if (n >= 0) {
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
			}
		} else {
			throw new IllegalArgumentException("No negative numbers allowed.");
		}

		return fact;
	}

}
