package Logical.Program;

public class FactorialExample {

	public static void main(String[] args) {
		int num =76;
		int fac = 1;
		for(int i=num; i>1; i--) {
			fac = fac*i;
		}
		System.out.println(fac);

	}

}
