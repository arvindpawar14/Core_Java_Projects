package Array;

import java.util.Arrays;

public class intArray {
	/**
	 *  single Dimensional array
	 */

	public static void main(String[] args) {
		int [] ar = new int[5];
		ar[0] = 23;
		ar[1] = 56;
		ar[2] = 76;
		ar[3] = 67;
		ar[4] = 90;
		
		System.out.println(ar.length);
		System.out.println(ar[4]);
		System.out.println("--------Print all information using int array---------" );
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]+ " ");
		}
		System.out.println("--------print all info using int array in asending order------");
		Arrays.sort(ar);
		for(int j=0; j<=ar.length-1; j++)
		{
			System.out.println(ar[j]);
		}
		System.out.println("print all info using int array in decending order---------");
		for(int k=ar.length-1; k>=0; k--)
		{
			System.out.println(ar[k]);
		}
	}

}
