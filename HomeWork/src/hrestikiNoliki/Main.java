package hrestikiNoliki;

public class Main {

	public static void main(String[] args) {
		int[][] field = new int[3][3];
		while (true) {

			field = playerInput(field);
			sysoArr(field);
			if (somebodyWin(win(field))) {
				break;
			}

			field = compInput(field);
			sysoArr(field);
			if (somebodyWin(win(field))) {
				break;
			}

			field = playerInput(field);
			sysoArr(field);
			if (somebodyWin(win(field))) {
				break;
			}

			field = compInput(field);
			sysoArr(field);
			if (somebodyWin(win(field))) {
				break;
			}

			field = playerInput(field);
			sysoArr(field);
			if (somebodyWin(win(field))) {
				break;
			}

			field = compInput(field);
			sysoArr(field);
			if (somebodyWin(win(field))) {
				break;
			}

			field = playerInput(field);
			sysoArr(field);
			if (somebodyWin(win(field))) {
				break;
			}

			field = compInput(field);
			sysoArr(field);
			if (somebodyWin(win(field))) {
				break;
			}

			field = playerInput(field);
			sysoArr(field);
			if (somebodyWin(win(field))) {
				break;
			}
			System.out.println("ͳ���");

			break;
		}
	}

	static boolean somebodyWin(int value) {
		boolean end = false;
		if (value == 1 || value == 2) {
			System.out.println("������ ������� ����� " + value);
			end = true;
		}
		return end;
	}

	static int[][] compInput(int array[][]) {
		int compCoorX = random(0, 2);
		int compCoorY = random(0, 2);
		if (array[compCoorX][compCoorY] == 0) {
			array[compCoorX][compCoorY] = 2;
		} else {
			while (array[compCoorX][compCoorY] != 0) {
				compCoorX = random(0, 2);
				compCoorY = random(0, 2);
			}
			array[compCoorX][compCoorY] = 2;
		}
		return array;
	}

	static int[][] playerInput(int array[][]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("������ ���������� �����");
		int playerCoorX = sc.nextInt();
		System.out.println("������ ���������� �������");
		int playerCoorY = sc.nextInt();
		if (array[playerCoorX][playerCoorY] == 0) {
			array[playerCoorX][playerCoorY] = 1;
		} else {
			while (array[playerCoorX][playerCoorY] != 0) {
				System.out.println("�� ������� �������");
				System.out.println("������ ���������� �����");
				playerCoorX = sc.nextInt();
				System.out.println("������ ���������� �������");
				playerCoorY = sc.nextInt();
			}
			array[playerCoorX][playerCoorY] = 1;
		}
		return array;
	}

	static void sysoArr(int field[][]) {
		System.out.println("���� ���� ����");
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				System.out.print(field[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	static int win(int array[][]) {
		int res = 0;
		if (array[0][0] == array[0][1] && array[0][1] == array[0][2]) {
			if (array[0][0] == 1) {
				res = 1;
			} else if (array[0][0] == 2) {
				res = 2;
			}
		}

		if (array[1][0] == array[1][1] && array[1][1] == array[1][2]) {
			if (array[1][0] == 1) {
				res = 1;
			} else if (array[1][0] == 2) {
				res = 2;
			}
		}

		if (array[2][0] == array[2][1] && array[2][1] == array[2][2]) {
			if (array[2][0] == 1) {
				res = 1;
			} else if (array[2][0] == 2) {
				res = 2;
			}
		}

		if (array[0][0] == array[1][0] && array[1][0] == array[2][0]) {
			if (array[0][0] == 1) {
				res = 1;
			} else if (array[0][0] == 2) {
				res = 2;
			}
		}

		if (array[0][1] == array[1][1] && array[1][1] == array[2][1]) {
			if (array[0][1] == 1) {
				res = 1;
			} else if (array[0][1] == 2) {
				res = 2;
			}
		}

		if (array[0][2] == array[1][2] && array[1][2] == array[2][2]) {
			if (array[0][2] == 1) {
				res = 1;
			} else if (array[0][2] == 2) {
				res = 2;
			}
		}
		if (array[0][0] == array[1][1] && array[1][1] == array[2][2]) {
			if (array[0][0] == 1) {
				res = 1;
			} else if (array[0][0] == 2) {
				res = 2;
			}
		}

		if (array[0][2] == array[1][1] && array[1][1] == array[2][0]) {
			if (array[0][2] == 1) {
				res = 1;
			} else if (array[0][2] == 2) {
				res = 2;
			}
		}
		return res;
	}

	static int random(int min, int max) {
		return (int) Math.round(Math.random() * (max - min) + min);

	}

}
