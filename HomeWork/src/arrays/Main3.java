package arrays;

public class Main3 {

	public static void main(String[] args) {
//		3. ������� ����� � 15 ���������� ����� ����� � ������ [0; 9].
//		������� ����� �� �����. ϳ�������� ������ � ����� ������ ��������
//		� �������� �� ������� �� ����� �� �������� �����.
		int[] arr = new int[15];
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]= (int) (Math.random()*10);
			if (arr[i]%2==0 && arr[i]!=0) {
				counter++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("ʳ������ ������ �������� = "+counter);

	}

}
