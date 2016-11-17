package ifElse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Discriminant {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введіть перше число");
		float numberOne = Float.parseFloat(reader.readLine());
		System.out.println("Введіть друге число");
		float numberTwo = Float.parseFloat(reader.readLine());
		System.out.println("Введіть третє число");
		float numberThree = Float.parseFloat(reader.readLine());
		float disc = ((numberTwo * numberTwo) - (4 * numberOne * numberThree));
		if (disc<0) {
			System.out.println("Розвязків немає");
		} else if (disc==0) {
			System.out.println("x = "+(-(numberTwo/(2*numberOne))));
		} else{
			System.out.println("x1 = "+(-numberTwo+Math.sqrt(disc)/(2*numberOne)));
			System.out.println("x2 = "+(-numberTwo-Math.sqrt(disc)/(2*numberOne)));
		}
	}

}
