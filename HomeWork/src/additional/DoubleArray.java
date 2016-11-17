package additional;

public class DoubleArray {

	public static void main(String[] args) {
		int[][] arr = new int[10][10];
		int count = 1;
		for (int i = 0; i < arr.length; i++) { arr[0][i]=count++; }//1-10
		
		for (int i = 1; i < arr.length; i++) { arr[i][9]=count++; }//11-19
		
		for (int i = arr.length-1; i >=0; i--) { arr[9][i]=count++-1; }//20-28
		
		for (int i = arr.length-1; i >=1; i--) { arr[i][0]=count++-2; }//29-36
		
		for (int i = 1; i < arr.length-1; i++) { arr[1][i]=count++-2; }//37-44
		
		for (int i = 2; i < arr.length-1; i++) { arr[i][8]=count++-2; }//45-51
		
		for (int i = arr.length-2; i >=1; i--) { arr[8][i]=count++-3; }//51-58
		
		for (int i = arr.length-2; i >=2; i--) { arr[i][1]=count++-4; }//58-64
		
		for (int i = 2; i < arr.length-2; i++) { arr[2][i]=count++-4; }//65-70
		
		for (int i = 3; i < arr.length-2; i++) { arr[i][7]=count++-4; }//71-75
		
		for (int i = arr.length-3; i >=2; i--) { arr[7][i]=count++-5; }//76-80
		
		for (int i = arr.length-3; i >=3; i--) { arr[i][2]=count++-6; }//81-84
		
		for (int i = 3; i < arr.length-3; i++) { arr[3][i]=count++-6; }//85-88
		
		for (int i = 4; i < arr.length-3; i++) { arr[i][6]=count++-6; }//89-91
		
		for (int i = arr.length-4; i >=3; i--) { arr[6][i]=count++-7; }//92-94
		
		for (int i = arr.length-4; i >=4; i--) { arr[i][3]=count++-8; }//95-96
		
		for (int i = 4; i < arr.length-4; i++) { arr[4][i]=count++-8; }//97-98
		
		for (int i = arr.length-5; i >=4; i--) { arr[5][i]=count++-8; }//99-100
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j]<10) {
					System.out.print(arr[i][j]+"   ");
				} else if (arr[i][j]<100) {
					System.out.print(arr[i][j]+"  ");
				} else System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}