package Logical.Program;

public class TotalNumberOfSpace1 {

	public static void main(String[] args) {
	 String str = "D N Y N NE GS FJFK H   HHDHHD ";
	 int num = 0;
	 for(int i=0; i<=str.length()-1; i++) {
		 char a=str.charAt(i);
		 if(a == ' ') {
		num++;
		 }
	 }
	 System.out.println("Count Number of Space " + num);
	}

}
