package Array;

import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		int [] ar = new int[6];
		ar[0] = 56;
		ar[1] = 76;
		ar[2] = 78;
		ar[3] = 45;
		ar[4] = 90;
		ar[5] = 91;
		
		System.out.println(ar.length);
		System.out.println(ar[3]);
		
		System.out.println("PRint all info using arrays");
		for(int i=0; i<=ar.length-1; i++) {
			System.out.println(ar[i]+ " ");
			}
		System.out.println("Print all info using Ascending order");
		Arrays.sort(ar);
		for(int j=0; j<=ar.length-1; j++ ){
			System.out.println(ar[j]+ "  ");
		}
		System.out.println("Print all info using Decending Order");
		for(int k=ar.length-1; k>0; k--) {
		System.out.println(ar[k]+ " ");	
		}
		}
	}


