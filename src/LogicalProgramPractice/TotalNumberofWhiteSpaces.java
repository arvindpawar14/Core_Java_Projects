package LogicalProgramPractice;

public class TotalNumberofWhiteSpaces {

	public static void main(String[] args) {
		String str = "A  R  V  I N  D";
		int count =0;
		for(int i=0; i<=str.length()-1; i++) {
			char c = str.charAt(i);
			if(c == ' ') {
				count++;
			}
		}
		System.out.println("Number of Space: " + count);

	}

}
