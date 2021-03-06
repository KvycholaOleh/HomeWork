package compare;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Controller controller = new Controller();
		while (true) {
			System.out.println("Enter 1 to add goods");
			System.out.println("Enter 2 to delete goods");
			System.out.println("Enter 3 to change goods");
			System.out.println("Enter 4 to sort");

			switch (sc.next()) {
			case "1":
				controller.addGoods();
				break;
			case "2":
				controller.deleteGoods();
				break;
			case "3":
				controller.changeGoods();
				break;
			case "4":
				boolean x = true;
				while(x){
					System.out.println("Enter 1 to sort by id ASC");
					System.out.println("Enter 2 to sort by id DESC");
					System.out.println("Enter 3 to sort by name ASC");
					System.out.println("Enter 4 to sort by name DESC");
					System.out.println("Enter 5 to sort by aviable ASC");
					System.out.println("Enter 6 to sort by aviable DESC");
					switch (sc.next()) {
					case "1":
						controller.sortByIdASC().forEach(System.out::println);
						x=false;
						break;
					case "2":
						controller.sortByIdDESC().forEach(System.out::println);
						x=false;
						break;
					case "3":
						controller.sortByNameASC().forEach(System.out::println);
						x=false;
						break;
					case "4":
						controller.sortByNameDESC().forEach(System.out::println);
						x=false;
						break;
					case "5":
						controller.sortByAviableASC().forEach(System.out::println);
						x=false;
						break;
					case "6":
						controller.sortByAviableDESC().forEach(System.out::println);
						x=false;
						break;
					default:
						x=false;
						break;
					}
				}


			default:
				break;
			}
		}

	}

}
