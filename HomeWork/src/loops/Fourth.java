package loops;

public class Fourth {

	public static void main(String[] args) {
		// 4. ������� ��������, �� �������� �� ����� ����� 20 �������� ����������� 2 4 8 16 32 64 128
		int n = 1;
		for (int i = 1; i <= 20; i++) {
			System.out.println(n *= 2);
		}

	}

}
