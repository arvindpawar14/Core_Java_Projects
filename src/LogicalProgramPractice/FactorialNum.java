package LogicalProgramPractice;

public class FactorialNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int num = 12;
		int fac = 1;
		for(int i=num; i>1; i--) {
			fac = fac*i;
		}
		System.out.println(fac);
	}

}
