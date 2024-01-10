package Array;

import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {
	String [] mn = new String [3];
	
	mn[0]="Ram";
	mn[1]="rohan";
	mn[2]="Arvind";
	System.out.println(mn.length);
	for(int i=0; i<=mn.length-1; i++) {
		System.out.println(mn[i]+" ");
	}
	Arrays.sort(mn);
	System.out.println("Ascending Order");
	for(int j=0; j<=mn.length-1; j++) {
		System.out.println(mn[j]+ " ");
	}
	System.out.println("For Decending Order");
	for(int k=mn.length-1; k>=0; k--) {
		System.out.println(mn[k]+ " ");
	}
	
	
	}

}
