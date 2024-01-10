package Logical.Program;

public class TotalWhiteSpaceExample1 {
	public static void main(String[] args) {
		String str = "F U SI ON TR AI NINI CE N TNE R  ";
		int space = 0;
		for(int i=0; i<=str.length()-1; i++) {
			char A = str.charAt(i);
			if(A == ' ') {
			space++;
			}
		}
		System.out.println("Number of Space in " +space);
	
	}

}
