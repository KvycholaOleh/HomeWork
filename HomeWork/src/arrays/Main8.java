package arrays;

public class Main8 {

	public static void main(String[] args) {
		// 8. ������� ����� � 12 ���������� ����� ����� � ������ [-15;
		// 15]. �������� ���� ������� � � ����� ����� ������������ � ��������
		// ������ ���� ���������� ��������� � �����.
		int [] arr = new int [12];
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*(16+15)-16);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ["+i+"]   ");
		}
		System.out.println();
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[max]<arr[i+1]) {
				max=i+1;
			}
		}
		System.out.println("��������� ������� � ����� �� ������ "+max);

	}

}
