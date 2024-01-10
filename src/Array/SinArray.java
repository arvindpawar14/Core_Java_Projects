package Array;

import java.util.Arrays;

public class SinArray {

	public static void main(String[] args) {
		int [] sing = {23,56,78,98,99,89,87};
		System.out.println(sing.length);
		System.out.println(sing[1]);
		System.out.println("Print using Single Arrey");
		for(int i=0; i<=sing.length-1; i++) {
			System.out.println(sing[i]+" ");
		}
		Arrays.sort(sing);
		System.out.println("Print Using Ascending Order");
		
		for(int j=0; j<=sing.length-1; j++) {
			System.out.print(sing[j]+" ");
		}
		System.out.println("Print using Descending Order");
		for(int k=sing.length-1; k>=0; k--) {
			System.out.print(sing[k]+ " ");
		}

	}

}
