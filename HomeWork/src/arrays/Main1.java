package arrays;

public class Main1 {

	public static void main(String[] args) {
		//1. ������� ����� � ��� ������ ����� �� 2 �� 20 � �������
		//�������� ������ �� ����� �������� � �����, ������������ ���� �������
		//�� ������ ����������, � ���� � �������� (������������ ���� �������
		//�� ������ �������� ������ �����). ����� ���������� ������ ���������,
		//����� �� ���� ������.
		int[] arr = new int [10];
		arr[0]=2;
		for (int i = 1; i < arr.length; i++) {
			arr[i]=arr[i-1]+2;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
