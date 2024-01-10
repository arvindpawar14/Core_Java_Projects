package Logical.Program;

public class TotalWhiteSpaces {

	public static void main(String[] args) {
		String str = "We l come to Fu  si o n";
		int count= 0;
		for(int i=0; i<=str.length()-1; i++) {
			char c = str.charAt(i);
			if(c == ' ') {
				count++;
			}
		}
		System.out.println("Number of White Spaces " +count);
	}

}
