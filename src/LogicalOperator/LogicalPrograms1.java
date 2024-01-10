package LogicalOperator;

public class LogicalPrograms1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -15;
		int b = 20;
		int c = 30;
		int f = 18;
		int g = 7;
		boolean d = true;
		boolean e = false;
		
		System.out.println(~a);  // Negation Operator
		System.out.println(!d);  // Not Operator
		System.out.println(~b);  // Negation Operator
		System.out.println(b<<2); //Left Shift Operator
		System.out.println(c>>3); //Right Shift Operator
		System.out.println(f&g); // Bitwise integral and
		System.out.println(f|g); // Bitwise integral or
		System.out.println(f^g); // Bitwise integral Xor 
	}
}
