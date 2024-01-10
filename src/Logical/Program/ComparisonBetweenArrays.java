package Logical.Program;

import java.util.Arrays;

public class ComparisonBetweenArrays {

	public static void main(String[] args) {
		int [] ar = {10, 20, 30};
		int [] ar1 = {10, 20,20};
		
		if(Arrays.equals(ar, ar1)) {
			System.out.println("Arrays are equal in nature");
		}
		else {
			System.out.println("Arreys are not equal in nature");
		}

	}

}
