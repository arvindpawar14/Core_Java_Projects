package Practice;

public class Example5 {

	public static void main(String[] args) {
		//       **********
		//      *********
		//     ********
		//    *******
		//   ******
		//  *****
		// ****
		//***
		//
		//
		int space = 7;
		int star = 10;
		for(int i=1; i<=8; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++) {
				System.out.print("*");
			}
			System.out.println();
			space=space-1;
			star=star-1;
		}

	}

}
