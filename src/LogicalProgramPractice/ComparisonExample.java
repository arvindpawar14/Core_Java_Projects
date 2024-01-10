package LogicalProgramPractice;

import java.util.Arrays;

public class ComparisonExample {

	public static void main(String[] args) {
		int [] in = { 24, 48, 67, 56};
		int [] in1 = {  24, 45, 67, 56};
		if(Arrays.equals(in, in1)) {
			System.out.println("They are equal in nature");
		}
		else {
			System.out.println("They are not equal in nature");
		}
	}

}
