package Practice;

public class SpaceExample1 {

	public static void main(String[] args) {
		String str = "A R V I  N  D";
		int space = 0;
		for(int i=0; i<=str.length()-1; i++) {
			char a= str.charAt(i);
			
		if(a == ' ') {
			 space++;
		}
		System.out.println(space);
		}
		

	}

}
