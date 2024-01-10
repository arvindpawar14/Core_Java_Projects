package LogicalOperator;

public class BitwiseandOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b =5;
		int c =20;
		System.out.println(a<b && a<c); //false && true = false
		System.out.println(a<b & a<c); //false & true = false
		System.out.println(a>b && ++a<c && ++b<c && ++c<a);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
