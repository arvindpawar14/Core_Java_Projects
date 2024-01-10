package Logical.Program;

import java.util.Arrays;

public class ComparisonExample {

	public static void main(String[] args) {
	String [] st = {"Arvind", "Sachin", "Dnyaneshwa", "Raju"};
	String [] st1 = {"Arvind", "Sachin", "Dnyaneshwar", "Raju"};
	
	if(Arrays.equals(st, st1)) {
		System.out.println("Elements Are Equal in nature");
	}
	else {
		System.out.println("Elements are not equal in nature");
	}
	}

}
