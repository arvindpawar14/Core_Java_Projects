package Logical.Program;
public class ReverseMiddleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Where Are You Going";
		System.out.println(str.length());
		String [] ar = str.split(" ");
		System.out.println(ar.length);
		for(int i=0; i<=ar.length-1; i++) {
			if(i % 2 == 0 ) {
				String s3 = ar[i];
				ar[i] = reverseString(s3);
			}
		}
		for(int i=0; i<=ar.length-1; i++) {
			System.out.print(ar[i]+ " ");
		}

	}

	private static String reverseString(String inp) {
		// TODO Auto-generated method stub
		String revString= "";
		for(int i=inp.length()-1; i>=0; i--) {
			revString = revString+inp.charAt(i);
		}
		return revString;
	}

}
