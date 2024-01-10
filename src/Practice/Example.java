package Practice;

public class Example {

	public static void main(String[] args) {
		//        ********
		//       ********
		//      ********
		//     ********
		//    ********
		//   ********
		//  ********
		// ********
		//********
		int space=8;
		int star=8;
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
		for(int j=1; j<=star; j++) {
			System.out.print("*");
		}
		System.out.println();
		space=space-1;
		}

	}

}
