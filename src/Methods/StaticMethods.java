package Methods;

public class StaticMethods {
	public static void add(int a, int b) {
		int add = a+b;
		System.out.println("Addition: "+add);
	}
	public static void mul(int a, int b) {
		int mul = a*b;
		System.out.println("Multiplication: "+mul);
	}
	public static void div(int a, int b) {
		int div = a/b;
		System.out.println("Division: "+div);
	}
	public static void sub(int a, int b) {
		int sub = a-b;
		System.out.println("Substraction: "+ sub);
	}
	public static void mod(int a, int b) {
		int mod = a%b;
		System.out.println("Modulus: "+mod);
	}
	public static void main(String[] args) {
	
		StaticMethods.div(40, 45);
		StaticMethods.mul(29, 67);
		add(3,5);
		div(15,5);
		
		
	}

}
