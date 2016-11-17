package arrays;

public class Main5 {

	public static void main(String[] args) {
//		5. Створіть 2 масиви з 5 випадкових цілих чисел з відрізка [0; 5]
//		кожен, виведіть масиви на екран у двох окремих рядках. Порахуйте
//		середнє арифметичне елементів кожного масиву і повідомте, для якого з
//		масивів це значення виявилося більше (або повідомте, що їх середні
//		арифметичні рівні).
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
			System.out.println("Середнє арифметичне першого масиву більше");
		} else if (ser1/arr.length<ser2/arr2.length) {
			System.out.println("Середнє арифметичне другого масиву більше");
		} else System.out.println("Середнє арифметичне обох масивів одинакове");

	}

}
