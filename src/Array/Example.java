package Array;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		
		String[] str = new String[6];
		str[0] = "Arvind";
		str[1] = "Raju";
		str[2] = "Ashok";
		str[3] = "Monali";
		str[4] = "Dnyaneshwar";
		str[5] = "Vilas";
		
		System.out.println(str.length);
		System.out.println(str[0]);
		System.out.println("-----print all info using string array-----");
		Arrays.sort(str);
		for(int i=0; i<=str.length-1; i++)
		{
			System.out.println(str[i]);
		}
		System.out.println("------Print all info using String array in Ascending form-------");
		for(int j=0; j<=str.length-1; j++)
		{
			System.out.println(str[j]);
		}
		System.out.println("--------Print all info using Decending order---- ");
		for(int k=str.length-1; k>=0; k--)
		{
			System.out.println(str[k]);
		}
	}

}
