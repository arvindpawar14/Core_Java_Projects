package Array;

public class muldiaExample3 {

	public static void main(String[] args) {
	
		String [] [] muldiaString = {{"Arvind", "Pallavi", "Mamata",},{"Rohan", "Vilas","Pravin"}};
		System.out.println("----Print All info using Muldimensional String Array-----");
		for(int i=0; i<=muldiaString.length-1; i++) {
			for(int j=0; j<=2; j++) {
				System.out.print(muldiaString[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
