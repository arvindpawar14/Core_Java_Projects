package Logical.Program;

public class ReverseStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Arvind";
		String str1 = "";
		for(int i=str.length()-1; i>=0; i--) {
			str1 = str1+str.charAt(i);
		}
		System.out.println(str1);
	}

}
