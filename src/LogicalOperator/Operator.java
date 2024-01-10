package LogicalOperator;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println(a<b && ++a<c && ++a<b && c>a);
		System.out.println("Values of a: "+a);
		System.out.println(a>b || ++a<b || ++b<a || c<b);
		System.out.println("Values of a: "+a);
		System.out.println("Values of b: "+b);
	}

}
