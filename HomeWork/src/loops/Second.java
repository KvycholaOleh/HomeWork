package loops;

public class Second {

	public static void main(String[] args) {
		// 2. ������� ��������, �� �������� �� ����� ����� 55 �������� ����������� 1 3 5 7 9 11 13 15 17
		int n = -1;
		for (int i = 1; i <= 55; i++) {
			System.out.println(n += 2);
		}
	}
}
