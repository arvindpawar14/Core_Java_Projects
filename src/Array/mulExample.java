package Array;

import java.util.Arrays;

public class mulExample {
	/**
	 * Multi-Dimensional Int array
	 * 
	 * columns   0   1   2  3 
	 * Row no 0  23  34  45 78
	 * Row no 1  56  78  26 76
	 * Row no 2  67	  3   6	 7
	 */

	public static void main(String[] args) {
		int [] [] sb = new int[3][4];
		sb[0][0]=23;
		sb[0][1]=34;
		sb[0][2]=45;
		sb[0][3]=78;
		sb[1][0]=56;
		sb[1][1]=78;
		sb[1][2]=26;
		sb[1][3]=79;
		sb[2][0]=67;
		sb[2][1]=102;
		sb[2][2]=190;
		sb[2][3]=89;
		
		System.out.println(sb.length);
		System.out.println(sb[1][2]);
		System.out.println("Print all using multi Diamensional Array");
		for(int i=0; i<=sb.length-1; i++) {
			//inner loop for columns
			for(int j=0; j<=sb.length-1; j++) {
				System.out.println(sb[i][j]+" ");
			}
		}
		Arrays.sort(sb);
		System.out.println("Print Ascending Order");
			for(int a=0; a<=sb.length-1; a++) {
				
					System.out.print(sb[a]+ " ");	
		}
			

//		//System.out.println();
//		System.out.println("Print Decending Order");
//			for(int k=sb.length-1; k>=0; k--) {
//				for(int l=0; l>=0; l--) {
//					System.out.print(sb[k][l]+ " ");
//				
//				}
			//}	
		
		
		}
}
	
	


