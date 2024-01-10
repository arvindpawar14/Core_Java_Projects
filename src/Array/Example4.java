package Array;

import java.util.Arrays;

public class Example4 {

	public static void main(String[] args) {
		int [] dn = new int[4];
		dn[0]=9;
		dn[1]=4;
		dn[2]=5;
		dn[3]=8;
		System.out.println(dn.length);
		System.out.println("Using Arrays");
		for(int i=0; i<=dn.length-1; i++) {
			System.out.println(dn[i]+ " ");
		}
		Arrays.sort(dn);
		System.out.println("Ascending Order");
		for(int j=0; j<=dn.length-1; j++) {
			System.out.println(dn[j]+ " ");
		}
		System.out.println("Decending Order");
		for(int k=dn.length-1; k>=0; k--) {
			System.out.println(dn[k]);
		}
	}

}
