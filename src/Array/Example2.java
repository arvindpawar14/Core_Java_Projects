package Array;

import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		int [] sb = new int[3];
		sb[0]=34;
		sb[1]=54;
		sb[2]=78;
		
		System.out.println(sb.length);
		System.out.println("Priint all info using array");
		for(int i=0; i<=sb.length-1; i++) {
			System.out.println(sb[i]+ " ");
		}
		Arrays.sort(sb);
		System.out.println("Print all information using decending order");
		for(int j=sb.length-1; j>=0; j--) {
			System.out.println(sb[j]+ " ");
		}
		System.out.println("Print all infor using Ascending Order");
		for(int k=0; k<=sb.length-1; k++) {
			System.out.println(sb[k]+" ");
		}

	}

}
