package Logical.Program;

public class PalindromeStringNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orgString = "Arvind";
		String revString = "";
		for(int i=orgString.length()-1; i>=0; i--) {
			revString = revString + orgString.charAt(i);
		}
		if(revString.equals(orgString)) {
			System.out.println("Given num "+ orgString + " is Palindrome num");
		}
		else {
			System.out.println("Given num "+ orgString + " is not Palindrome num");
		}
	}

}
