package LogicalProgramPractice;

public class FactorialNumberE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 8;
		int fac = 1;
		for(int i=num; i>1; i--) {
			fac = fac*i;
		}
		System.out.println(fac);

	}

}
