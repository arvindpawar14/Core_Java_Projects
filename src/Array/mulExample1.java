package Array;

import java.util.Arrays;

public class mulExample1 {

	public static void main(String[] args) {
		String [][] raj = new String [2][4];
		raj[0][0]="Swapnil";
		raj[0][1]="Kunal";
		raj[0][2]="Sonu";
		raj[0][3]="Ankita";
		raj[1][0]="Arvind";
		raj[1][1]="Pallavi";
		raj[1][2]="Dnyaneshwar";
		raj[1][3]="Varsha";
		System.out.println(raj.length);
		System.out.println(raj[0][3]);	
		System.out.println("Print using multi dimensional");
		for(int i=0; i<=raj.length-1; i++) {
			
			for(int j=0; j<=3; j++) {
				System.out.print(raj[i][j]+" ");
			}
			System.out.println();
		}
		for(int k=0; k<=raj.length-1; k++){
			for(int l=0; l<=3; l++) {
				System.out.println(raj[k][l]);
			}
		}
	}

}
