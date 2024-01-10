package LogicalProgramPractice;

public class ArmStrongNumbe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nm = 153;
		int sb = 0;
		for(int i=nm; i>0; i=i/10) {
			int rem = i % 10;
			sb= sb+(rem*rem*rem);
		}
		if(sb == nm) {
			System.out.println("The Number is "+ nm + " Armstrong Num");
		}
		else {
			System.out.println("The Number is not "+ nm + " Armstrong Num");
		}

	}

}
