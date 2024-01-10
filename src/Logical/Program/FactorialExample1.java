package Logical.Program;

public class FactorialExample1 {

	public static void main(String[] args) {
		int num = 6;
		int fac = 1;
		for(int i=num; i>1; i--) {
			fac = fac*i;
		}
		System.out.println(fac);

	}

}
