package Practice;

import java.util.Arrays;

public class Comparisoing {

	public static void main(String[] args) {
		String [] str = {"Arvin", "Sachin"};
		String [] str1 = {"Arvind", "Sachin"};
		if(Arrays.equals(str, str1)) {
			System.out.println("Same Values Present");
		}
		else {
			System.out.println("Arreys are not equal");
		}
	}

}
