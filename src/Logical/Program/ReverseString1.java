package Logical.Program;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Arvind Pawar";
		String revstr = "";
		for(int i=str.length()-1; i>=0; i--) {
			revstr = revstr + str.charAt(i);
		}
		System.out.println("Origional letter " +str );
		System.out.println("Origional letter " +revstr );
	}

}
