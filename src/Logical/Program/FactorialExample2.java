package Logical.Program;

public class FactorialExample2 {

	public static void main(String[] args) {
		int num = 93;
		int fac = 1;
		for(int i=num; i>1; i--) {
			fac = fac*i;		
		}
		System.out.println(fac);

	}

}
