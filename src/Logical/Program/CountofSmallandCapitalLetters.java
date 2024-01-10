package Logical.Program;

public class CountofSmallandCapitalLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "WElocme to Fusio Institure";
		int upparCase = 0;
		int LowerCase = 0;
		for(int i=0; i<=str.length()-1; i++){
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <='Z') {
				upparCase++;
			}
			else if(ch>='a' && ch<='z') {
				LowerCase++;
			}
			else {
				continue;
			}
			
		}
			System.out.println("Uppercase Letter Count is are: " + upparCase);
			System.out.println("LowerCase Letter Count is are: " + LowerCase);

	}

}
