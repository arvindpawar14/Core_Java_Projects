package Star.pattern.logical.program;

public class Example8 {

	public static void main(String[] args) {
		//        *****
		//       *****
		//      *****
		//     *****
		//    *****
		//   *****
		//  *****
		// *****
		int space= 8;
		int star= 5;
		for(int i=1; i<=8; i++) {
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
