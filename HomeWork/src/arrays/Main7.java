package arrays;

public class Main7 {

	public static void main(String[] args) {
		// 7. ������� ����� � 20-�� ������ ����� Գ������� � ������� ����
		// �� �����. ��������, �� ������ � ������ ����� ����������� ����
		// ��������, � ����� ��������� - ����� ���� ����������.
		int [] arr = new int[20];
		arr[0]=1;
		arr[1]=1;
		for (int i = 2; i < arr.length; i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
