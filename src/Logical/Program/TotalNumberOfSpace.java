package Logical.Program;

public class TotalNumberOfSpace {

	public static void main(String[] args) {
		String s = "I  AM L E A R I N G AS A AUTO MATION TESTIN G";
		int count = 0;
		for(int i=0; i<=s.length()-1; i++) {
			char m = s.charAt(i);
			if(m == ' ') {
				count++;
			}
		}
		System.out.println("Number Of Space " +count);
	}

}
