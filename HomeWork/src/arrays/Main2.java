package arrays;

public class Main2 {

	public static void main(String[] args) {
//		2. ������� ����� � ��� �������� ����� �� 1 �� 99, ������� ����
//		�� ����� � �����, � ���� ��� �� ����� ������� �� ����� ��� � �����,
//		��� � ���������� ������� (99 97 95 93 ... 7 5 3 1).
		//99-i*2
		int arr[] = new int [50];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 99-i*2;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[arr.length-i-1]+" ");
		}

	}

}
