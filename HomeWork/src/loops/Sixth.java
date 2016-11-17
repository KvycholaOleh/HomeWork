package loops;

public class Sixth {

	public static void main(String[] args) {
		// 6. Виведіть на екран всі двозначні члени послідовності 2a+200, де a1= -166.
		for (int i = -166; 2 * i + 200 < 100 ; i++) {
			if (2 * i + 200 > -100 && 2 * i + 200 < 100) {
				System.out.println(2 * i + 200);
			}
		}

	}

}
