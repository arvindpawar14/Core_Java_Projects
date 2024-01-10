package LogicalProgramPractice;

public class ArmStrongNumber1 {

	public static void main(String[] args) {
		int num = 789;
		int sum = 0;
		for(int i=num; i>0; i=i/10) {
			int rem = i % 10;
			sum = sum + (rem*rem*rem);
		}
		if(num == sum) {
			System.out.println("ArmStong Number: "+ num);
		}
		else {
			System.out.println("is not ArmStong Number: "+ num);
		}
	}

}
