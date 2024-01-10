package LogicalProgramPractice;

public class ArmStrongExample1 {

	public static void main(String[] args) {
		int num = 7898;
		int sum = 0;
		for(int i=num; i>0; i=i/10) {
			int rem = i % 10;
			sum = sum+(rem*rem*rem*rem);
		}
		if(sum == num) {
			System.out.println("This number "+ num + " is armstrongnum");
		}
		else {
			System.out.println("This number "+ num + " is not armstrongnum");
		}

	}

}
