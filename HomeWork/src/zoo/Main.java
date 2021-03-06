package zoo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		Controller controller = new Controller();
		while (true) {

			System.out.println("Enter 1 to add club member");
			System.out.println("Enter 2 to add pet to club member");
			System.out.println("Enter 3 to delete pet from club member");
			System.out.println("Enter 4 to delete club member");
			System.out.println("Enter 5 to delete pet from all members");
			System.out.println("Enter 6 to show zooclub");
			System.out.println("Enter 7 to save into file");
			System.out.println("Enter 8 to read from file");
			System.out.println("Enter 9 to exit");

			switch (sc.next()) {
			case "1":
				controller.addPerson();
				break;
			case "2":
				controller.addPetToMember();
				break;

			case "3":
				controller.deletePetFromMember();
				break;

			case "4":
				controller.deleteMember();
				break;

			case "5":
				controller.deletePetFromAllMembers();
				break;

			case "6":
				controller.showAll();
				break;
			case "7":
				controller.saveToFile();
				break;
				
			case "8":
				controller.readFromFile();
				break;
				
			case "9":
				sc.close();
				System.exit(0);
				break;

			default:
				break;
			}

		}

	}

}
