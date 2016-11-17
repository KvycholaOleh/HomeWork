package arrays;

public class Main3 {

	public static void main(String[] args) {
//		3. Створіть масив з 15 випадкових цілих чисел з відрізка [0; 9].
//		Виведіть масив на екран. Підрахуйте скільки в масиві парних елементів
//		і виведете цю кількість на екран на окремому рядку.
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
		System.out.println("Кількість парних елементів = "+counter);

	}

}
