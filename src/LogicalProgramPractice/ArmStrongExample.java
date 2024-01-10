package LogicalProgramPractice;

public class ArmStrongExample {

	public static void main(String[] args) {
		int num = 153;
		int sum = 0;
		for(int i=num; i>0; i=i/10) {
			int rem = i % 10;
			sum = sum+(rem*rem*rem);
		}
		if(sum == num) {
			System.out.println("This is "+ num + " Armstrong Number");
		}
		else {
			System.out.println("This is "+ num + " not Armstrong Number");
		}
	}

}
