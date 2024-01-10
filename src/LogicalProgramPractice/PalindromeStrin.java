package LogicalProgramPractice;

public class PalindromeStrin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orgString = "ABCD";
		String revString ="";
		for(int i=orgString.length()-1; i>=0; i--) {
			revString = revString + orgString.charAt(i);
		}
		if(revString.equals(orgString)) {
			System.out.println("Given Number: "+ orgString + "is Palindrome");
		}
		else {
			System.out.println("Given Number: "+ orgString + " is not Palindrome");
		}
	}

}
