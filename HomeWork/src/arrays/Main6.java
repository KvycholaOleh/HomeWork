package arrays;

public class Main6 {

	public static void main(String[] args) {
		// 6. ������� ����� � 4 ���������� ����� ����� � ������ [10; 99],
		// ������� ���� �� ����� � �����. ��������� � ������� �� �����
		// ����������� ��� ��, �� � ����� ������ ��������� ������������.
		int[] arr = new int[4];
		int k=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (100 - 10) + 10);
			System.out.print(arr[i]+" ");
		}
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]<=arr[i+1]) {
				k++;
			}
		}
		System.out.println();
		if (k==3) {
			System.out.println("����� ������ ��������� ������������");
		} else System.out.println("����� HE ��������� ������������");

	}

}
