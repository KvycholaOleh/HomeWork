package loops;

public class Fifth {

	public static void main(String[] args) {
		// 5. Виведіть на екран всі числа в послідовності 2a-1, де a1 = 2,які менше 10000.
		for (int i = 2; (2 * i - 1) < 10000; i++) {
			System.out.println(2 * i - 1);
		}
	}
}
