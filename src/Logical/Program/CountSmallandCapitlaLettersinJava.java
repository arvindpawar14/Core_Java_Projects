package Logical.Program;

public class CountSmallandCapitlaLettersinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Arvind Parmeshwar PawaR";
		int upparCase = 0;
		int Lowercase = 0;
		for(int i=0; i<=str.length()-1; i++) {
			char ch = str.charAt(i);
			if(ch >='A' && ch<='Z') {
				upparCase++;
			}
			else if(ch >='a' && ch<='z') {
				Lowercase++;
			}
			else {
				continue;
			}
		}
		System.out.println("Count UpperCase: "+ upparCase);
		System.out.println("Count Lowercase: "+ Lowercase);
	}

}
