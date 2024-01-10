package Excercise;

public class PalindromeStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String str = "LEVEL";
		String rev = "";
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev +str.charAt(i);
		}
		if(rev.equals(str)) {
			System.out.println("Given "+ str + " is Palindrome");
		}
		else {
			System.out.println("Given "+ str + " is not Palindrome");
		}

	}

}
