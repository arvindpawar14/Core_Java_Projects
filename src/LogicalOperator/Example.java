package LogicalOperator;

public class Example {

	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		boolean c = true;
		boolean d = false;
		System.out.println("Negation of value a: "+~a); // Negation Operator
		System.out.println("Negation of value b: "+~b); // Negation Operator
		System.out.println(!c); // Not Operator
		System.out.println(!d); // Not Operator
		System.out.println("Left Shift Operation a: " +(a<<2)); // Left Shift Operator
		System.out.println("Left Shift Operation b: "+(b<<2)); // Left Shift Operator
		System.out.println("Right Shift Operation a: "+(a>>2)); // Right Shift Operation
		System.out.println("Right Shift Operation b: "+(b>>2)); // Right Shift Operation
		System.out.println("Bitwise Integral and: "+ (a&b));   // Bitwise integral  and
		System.out.println("Bitwise Integral or: "+ (a|b));   // Bitwise integral  or
		System.out.println("Bitwise Integral Xor: "+ (a^b));   // Bitwise integral  and
	}

}
