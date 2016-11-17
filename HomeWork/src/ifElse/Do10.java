package ifElse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Do10 {

	public static void main(String[] args) throws IOException {
		float ten = 10;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("¬вед≥ть перше число");
		float numberOne = Float.parseFloat(reader.readLine());
		System.out.println("¬вед≥ть друге число");
		float numberTwo = Float.parseFloat(reader.readLine());
		if (Math.abs(ten-numberOne)<Math.abs(ten-numberTwo)) {
			System.out.println("„исло "+numberOne+" найближче до 10");
		} else System.out.println("„исло "+numberTwo+" найближче до 10");
	}

}
