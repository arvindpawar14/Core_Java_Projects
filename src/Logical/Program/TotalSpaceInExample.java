package Logical.Program;

public class TotalSpaceInExample {

	public static void main(String[] args) {
		String str = "A R V I N D";
		int num = 0;
		for(int i=0; i<=str.length()-1; i++) {
			char m = str.charAt(i);
		if(m == ' ') {
		num++;
		}
	}
		System.out.println("Count Number of Space in " + num);
	}

}
