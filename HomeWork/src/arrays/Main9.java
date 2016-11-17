package arrays;

public class Main9 {

	public static void main(String[] args) {
		// 9. ������� ��� ������ � 10 ����� ���������� ����� � ������ [1;
		// 9] � ����� ����� � 10 ������ �����. ����� ������� � i-�� ��������
		// �������� ������ ������� ���������� ��������� �������� � �������
		// ������ � i-�� �������� �� �������� � ������� ������ � i-�� ��������.
		// ������� �� ��� ������ �� ����� (����� �� �������� �����), ����
		// ������� ������� ����� �������� � �������� �����.
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		double[] arr3 = new double[10];
		int counter =0;
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * (10 - 1) + 1);
			arr2[i] = (int) (Math.random() * (10 - 1) + 1);
			arr3[i] = (double)arr1[i] / (double)arr2[i];
			if (arr1[i] % arr2[i]==0) {
				counter++;
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "  ");
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "  ");
		}
		System.out.println();
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " | ");
		}
		System.out.println();
		System.out.println("������� ����� �������� � �������� ����� = "+counter);

	}

}
