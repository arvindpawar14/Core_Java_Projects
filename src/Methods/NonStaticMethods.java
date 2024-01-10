package Methods;

public class NonStaticMethods {
	public void add(int a, int b) {
		int sum = a+b;
		System.out.println("Addition Methods: " +sum);
	}
	public void mul(int a, int b) {
		int mul = a*b;
		System.out.println("Multiplication Methods: "+mul);
	}
	public void div(int a, int b) {
		int div = a/b;
		System.out.println("Division Methods: " +div);
	}
	public void sub(int a, int b) {
		int sub = a-b;
		System.out.println("Substraction Methods: " +sub);
	}
	public void mod(int a, int b) {
		int mod = a%b;
		System.out.println("Modulus Method: "+mod);
	}
	
	public static void main(String[] args) {
		NonStaticMethods t1 = new NonStaticMethods();
		t1.add(40, 20);
		t1.mul(60, 20);
		t1.sub(40, 20);
		t1.div(60, 20);
		t1.mod(100, 5);
	}

}
