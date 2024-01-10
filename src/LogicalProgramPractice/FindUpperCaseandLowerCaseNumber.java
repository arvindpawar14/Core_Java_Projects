package LogicalProgramPractice;

public class FindUpperCaseandLowerCaseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Nehrunagr Taluk KANDHAR";
		int uppercase = 0;
		int lowercase = 0;
		for(int i=0; i<=str.length()-1; i++) {
			char sb = str.charAt(i);
			if(sb >='A' && sb<='Z') {
				uppercase++;
			}
			else if(sb>='a' && sb<='z') {
				lowercase++;
			}
			else {
				continue;
			}
		}
		System.out.println("Count UpperCase: "+ uppercase);
		System.out.println("Count LowerCase: "+ lowercase);
	}

}
