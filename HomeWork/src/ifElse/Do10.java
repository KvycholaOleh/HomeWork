package ifElse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Do10 {

	public static void main(String[] args) throws IOException {
		float ten = 10;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������ ����� �����");
		float numberOne = Float.parseFloat(reader.readLine());
		System.out.println("������ ����� �����");
		float numberTwo = Float.parseFloat(reader.readLine());
		if (Math.abs(ten-numberOne)<Math.abs(ten-numberTwo)) {
			System.out.println("����� "+numberOne+" ��������� �� 10");
		} else System.out.println("����� "+numberTwo+" ��������� �� 10");
	}

}
