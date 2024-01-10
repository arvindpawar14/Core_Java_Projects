package Logical.Program;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		int [] in = {15,25,56,78};
		int [] in1 = {15,66,56,78};
		String [] st = {"Arvind", "Dnyaneshwar"};
		String [] st1= {"Arvind", "Dnyaneshwar"};
		
		if(Arrays.equals(in, in1)) {
			System.out.println("Arreys are equal in Nature");
		}
		else {
			System.out.println("Arreys are not equal in nature");
		}
		if(Arrays.equals(st, st1)) {
			System.out.println("Arreys Character are equal in Nature");
		}
		else {
			System.out.println("Arreys are not equal in nature");
		}
	}

}
