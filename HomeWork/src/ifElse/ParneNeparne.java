package ifElse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParneNeparne {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������ �����");
		int number = Integer.parseInt(reader.readLine());
		if (number%2==0) {
			System.out.println("�����");
		} else System.out.println("�� �����");
	}

}
