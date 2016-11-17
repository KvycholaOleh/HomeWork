package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Seventh {

	public static void main(String[] args) throws IOException {
		//7. Створіть програму, яка обчислює факторіал натурального числа n, яке користувач введе з клавіатури.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введіть число");
		int fact = Integer.parseInt(reader.readLine());
		long res=fact;
		for (int i = 1; i < fact; i++) {
			res*=fact-i;
		}
		System.out.println("Факторіал від "+fact+" = "+res);
	}

}
