package LogicalProgramPractice;

import java.util.Arrays;

public class ComparisionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] str = {"Arvin", "Sachin"};
		String [] str1 = {"Arvind", "Sachin"};
		
		if(Arrays.equals(str, str1)) {
			System.out.println("Arrays are eqal in nature");
		}
		else {
			System.out.println("Arrays are not eqal in nature");
		}
	}

}
