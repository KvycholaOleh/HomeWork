package arrays;

public class Main10 {

	public static void main(String[] args) {

		// 10. ������� ����� � 11 ���������� ����� ����� �
		// ������ [-1; 1], ������� ����� �� ����� � �����. �������� ����
		// ������� ����������� � ����� ��������� � ������� ��� ��
		// ����������� �� �����. ���� ��� ������� �������� ������������
		// �������� ������� ����, �� �� �������� �����.
		int [] arr = new int[11];
		int minus=0;
		int zero=0;
		int plus=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(int) (Math.random()*(3+1)-2);
			System.out.print(arr[i]+"  ");
			if(arr[i]< 0)minus++;
            if(arr[i]==0)zero++;
            if(arr[i]>0)plus++;
            if(i==arr.length-1){
            if(minus>zero&minus>plus)
                System.out.println("\n������ ������ ����������� -1");
            if(zero>minus&zero>plus)
                System.out.println("\n������ ������ ����������� 0");
            if(plus>minus&plus>zero)
                System.out.println("\n������ ������ ����������� 1");
		}
		}
	}

}
