package arrays;

public class Main5 {

	public static void main(String[] args) {
//		5. ������� 2 ������ � 5 ���������� ����� ����� � ������ [0; 5]
//		�����, ������� ������ �� ����� � ���� ������� ������. ���������
//		������ ����������� �������� ������� ������ � ��������, ��� ����� �
//		������ �� �������� ��������� ����� (��� ��������, �� �� ������
//		���������� ���).
		int[] arr = new int[5];
		int[] arr2 = new int[5];
		double ser1 = 0;
		double ser2 = 0;
		for (int i = 0; i < arr2.length; i++) {
			arr[i]= (int) (Math.random()*6);
			arr2[i]= (int) (Math.random()*6);
		}
		for (int i = 0; i < arr.length; i++) {
			ser1+=arr[i];
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			ser2+=arr2[i];
			System.out.print(arr2[i]+" ");
		}
		
		System.out.println();
		if (ser1/arr.length>ser2/arr2.length) {
			System.out.println("������ ����������� ������� ������ �����");
		} else if (ser1/arr.length<ser2/arr2.length) {
			System.out.println("������ ����������� ������� ������ �����");
		} else System.out.println("������ ����������� ���� ������ ���������");

	}

}
