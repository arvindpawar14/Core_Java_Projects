package Array;

public class MultidimentionalArrey {

	public static void main(String[] args) {
	/**
	 * Multidimensional int array
	 */
		int [][] muldia = new int [2][4];
		muldia[0][0]= 23;
		muldia[0][1]= 26;
		muldia[0][2]= 28;
		muldia[0][3]= 98;
		muldia[1][0]= 87;
		muldia[1][1]= 87;
		muldia[1][2]= 90;
		muldia[1][3]= 89;
		
		System.out.println(muldia.length);
		System.out.println(muldia[1][2]);
		System.out.println("----Print all info using multidimensional Array-----");
		for(int i=0; i<=muldia.length-1; i++) {
		
			for(int j=0; j<=3; j++) {
				System.out.print(muldia[i][j] + " ");
			}
			System.out.println();
		}
			
	}

}
