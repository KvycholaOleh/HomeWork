package except;

public class Methods {

	public static double add(int a, int b) throws IllegalAccessException {
		if (a < 0 || b < 0) {
			throw new IllegalArgumentException("a or b < 0");
		} else if (a == 0 && b != 0 || a != 0 && b == 0) {
			throw new ArithmeticException("a=0 or b=0");
		} else if (a == 0 && b == 0) {
				throw new IllegalAccessException("a=b and b=0");
		} else if (a > 0 && b > 0) {
			
				throw new MyException("My exception");
			
		}
		return a + b;

	}

	public static double sub(int a, int b) throws IllegalAccessException {
		if (a < 0 || b < 0) {
			throw new IllegalArgumentException("a or b < 0");
		} else if (a == 0 && b != 0 || a != 0 && b == 0) {
			throw new ArithmeticException("a=0 or b=0");
		} else if (a == 0 && b == 0) {
				throw new IllegalAccessException("a=b and b=0");
		} else if (a > 0 && b > 0) {
			
				throw new MyException("My exception");
			
		}
		return a - b;
	}

	public static double mult(int a, int b) throws IllegalAccessException {
		if (a < 0 || b < 0) {
			throw new IllegalArgumentException("a or b < 0");
		} else if (a == 0 && b != 0 || a != 0 && b == 0) {
			throw new ArithmeticException("a=0 or b=0");
		} else if (a == 0 && b == 0) {
				throw new IllegalAccessException("a=b and b=0");
		} else if (a > 0 && b > 0) {
			
				throw new MyException("My exception");
			
		}
		return a * b;
	}

	public static double div(int a, int b) throws IllegalAccessException {
		if (a < 0 || b < 0) {
			throw new IllegalArgumentException("a or b < 0");
		} else if (a == 0 && b != 0 || a != 0 && b == 0) {
			throw new ArithmeticException("a=0 or b=0");
		} else if (a == 0 && b == 0) {
				throw new IllegalAccessException("a=b and b=0");
		} else if (a > 0 && b > 0) {
			
				throw new MyException("My exception");
			
		}
		return a / b;
	}

}
