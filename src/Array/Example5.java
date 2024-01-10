package Array;

import java.util.Arrays;

public class Example5 {

	public static void main(String[] args) {
		int [] gb = {65, 67, 45, 90, 87};
		String [] nb = {"Arvind","Raju", "Mohan", "Swapnil", "Akshay"};
		System.out.println(gb.length);
		System.out.println(nb.length);
		System.out.println("Print using Arrays");
		for(int i=0; i<=gb.length-1; i++) {
			System.out.println(gb[i]+" ");
		}
		for(int j=0; j<=nb.length-1; j++) {
			System.out.println(nb[j]+" ");
		}
		Arrays.sort(gb);
		Arrays.sort(nb);
		System.out.println("Ascending Order");
		for(int k=0; k<=gb.length-1; k++) {
			System.out.println(gb[k]+ " ");
		}
		for(int l=0; l<=nb.length-1; l++) {
			System.out.println(nb[l]+ " ");
		}
		System.out.println("Decending Order");
		for(int m=gb.length-1; m>=0; m--) {
			System.out.println(gb[m]+" ");
		}
		for(int n=nb.length-1; n>=0; n--) {
			System.out.println(nb[n]+ " ");
		}

	}

}
