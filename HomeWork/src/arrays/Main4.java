package arrays;

public class Main4 {

	public static void main(String[] args) {
//		4. Створіть масив з 8 випадкових цілих чисел з відрізка [1; 10].
//		Виведіть масив на екран у рядок. Замініть кожен елемент з непарним
//		індексом на нуль. Знову виведете масив на екран на окремому рядку.
		int[] arr = new int[8];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*(11-1)+1);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		for (int i = 0; i < arr.length; i++) {
			if (i%2!=0) {
				arr[i]=0;
			}
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
