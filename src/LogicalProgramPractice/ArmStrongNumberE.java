package LogicalProgramPractice;

public class ArmStrongNumberE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 789;
		int sum = 0;
		for(int i=num; i>0; i=i/10) {
			int rem = i % 10;
			sum = sum+(rem*rem*rem);
		}
		if(sum == num) {
			System.out.println("The number "+ num + "is Armstrong");
		}
		else {
			System.out.println("The number "+ num + "is not Armstrong");
		}
	}

}
