package Logical.Program;

public class CountSmallandCapitalLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Rahod Dnyanewsshara Ravindere Faltu Ahe";
		int upparcase = 0;
		int lowercase = 0;
		for(int i=0; i<=str.length()-1; i++) {
			char ap = str.charAt(i);
			if(ap>='A' && ap<='Z') {
				upparcase++;
			}
			else if(ap>='a' && ap<='z') {
				lowercase++;
			}
			else {
				continue;
			}
		}
		System.out.println("UppercaseNumbe : "+ upparcase);
		System.out.println("lowercasecaseNumbe : "+ lowercase);
	}

}
