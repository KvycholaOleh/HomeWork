package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eighth {

	public static void main(String[] args) throws IOException {
		//8. ������� �� ����� �� �������� ��������� ������������ �����, ��������� ������������ � ���������.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������ �����");
		int num = Integer.parseInt(reader.readLine());
		for (int i = 1; i <= num; i++) {
			if (num%i==0) {
				System.out.println(i);
			}
		}
	}

}
