package Methods;

public class Example2 {
	static int a =20;
	static int b = 10;
	public void add(){
		int sum = a+b;
		System.out.println("Addition: " +sum);
	}
	public void mul() {
		int mul = a*b;
		System.out.println("Multiplicaton:"+mul);
	}
	public void div() {
		int div = a/b;
		System.out.println("Division: " +div);
	}
	public static void main(String[] args) {
		Example2 t = new Example2();
		t.add();
		t.mul();
		t.div();
	}

}
