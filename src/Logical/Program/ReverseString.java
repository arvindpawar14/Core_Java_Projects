package Logical.Program;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Arvind";
		String revstr= "";
		for(int i=str.length()-1; i>=0; i--) {
			revstr = revstr + str.charAt(i);
		}
		System.out.println("Origional String: "+ str );
		System.out.println("RevOrigional String: "+ revstr );
	}

}
