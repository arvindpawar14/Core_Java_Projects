package Logical.Program;

public class StringRevese {

	public static void main(String[] args) {
		String str = "Arvind";
		int len = str.length();
		String rev="";
		
		for(int i=len-1; i>=0; i-- ) {
			
			rev=rev + str.charAt(i);
			
		}
		System.out.println(rev);
	}

}
