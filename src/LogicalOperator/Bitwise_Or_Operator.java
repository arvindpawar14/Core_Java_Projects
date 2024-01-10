package LogicalOperator;

public class Bitwise_Or_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b =5;
		int c =20;
		System.out.println(a>b || a<c); // true ||true = true
		System.out.println(a>b | a<c); // true |true = true
		System.out.println(a>b | a++<c);
		System.out.println(a);
		System.out.println(a<b || ++a<b || ++b>c || ++c>b);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//Bitwise XOR Operator
		System.out.println("a ^ b :- " +(a^b));
		//Bitwise Negation Operator
		System.out.println("A is Value: " +(~a));
	}
}
