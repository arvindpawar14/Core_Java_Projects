package Logical.Program;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "LEVEL";
		String restr = "";
		for(int i=str.length()-1; i>=0; i--) {
			restr = restr + str.charAt(i);
		}
		if(restr.equals(str)) {
			System.out.println("Given Stirng " + str + " is Palindrone String");
		}
		else {
			System.out.println("Given Stirng " + str + " is not Palindrone String");
		}

	}

}
