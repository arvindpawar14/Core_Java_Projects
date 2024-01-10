package LogicalProgramPractice;

public class FactorialExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12;
		int fac = 1;
		for(int i=num; i>1; i--) {
			fac=fac*i; 
		}
		System.out.println(fac);
	}

}
