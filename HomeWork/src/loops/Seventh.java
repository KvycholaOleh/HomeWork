package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Seventh {

	public static void main(String[] args) throws IOException {
		//7. ������� ��������, ��� �������� �������� ������������ ����� n, ��� ���������� ����� � ���������.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������ �����");
		int fact = Integer.parseInt(reader.readLine());
		long res=fact;
		for (int i = 1; i < fact; i++) {
			res*=fact-i;
		}
		System.out.println("�������� �� "+fact+" = "+res);
	}

}
