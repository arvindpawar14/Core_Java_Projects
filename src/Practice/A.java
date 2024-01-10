package Practice;

public class A {

	public static void main(String[] args) {

//		for (int i = 0; i <= 10; i++) {
//			if (i % 2 == 0) {
//				System.out.println("Even Number " + i);
//			} else {
//				System.out.println("Odd Number " + i);
//			}
//			
//		}

//		String s = "Arvind";
//
//		for (int i = s.length() - 1; i >= 0; i--) {
//			char rev1 = s.charAt(i);
//			System.out.print(rev1);
//		}

		
//		for(int i=0; i<=10; i++) {
//			if(i%2==1) {
//				System.out.println("Odd Num "+i);
//			}
//			else {
//				System.out.println("Even Num "+i);
//			}
//		}
		
		
		try {
			int a =10/0;
			System.out.println(a);
			String s=null;
			System.out.println(s);
		}
		
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (NullPointerException un) {
			System.out.println(un);
		}
		catch (Exception en) {
			System.out.println(en);
		}
	}

}
