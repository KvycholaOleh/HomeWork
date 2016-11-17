package arrays;

public class Main10 {

	public static void main(String[] args) {

		// 10. Створіть масив з 11 випадкових цілих чисел з
		// відрізка [-1; 1], виведіть масив на екран у рядок. Визначте який
		// елемент зустрічається в масиві найчастіше і виведіть про це
		// повідомлення на екран. Якщо два якихось елемента зустрічаються
		// однакову кількість разів, то не виводьте нічого.
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
                System.out.println("\nЧастіше всього зустрічається -1");
            if(zero>minus&zero>plus)
                System.out.println("\nЧастіше всього зустрічається 0");
            if(plus>minus&plus>zero)
                System.out.println("\nЧастіше всього зустрічається 1");
		}
		}
	}

}
