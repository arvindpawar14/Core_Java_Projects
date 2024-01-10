package Excercise;

public class PalindromeExamle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String org = "LEVEL";
		String rev = "";
		for(int i=org.length()-1; i>=0; i--) {
			rev =rev +org.charAt(i);
		}
		if(rev.equals(org)) {
			System.out.println("Given " + org + " is Palindrome");
		}
		else {
			System.out.println("Given " + org + " is not Palindrome");
		}

	}

}
