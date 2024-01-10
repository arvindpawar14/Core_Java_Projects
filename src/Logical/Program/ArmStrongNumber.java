package Logical.Program;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int num = 153;
		int sum=0;
		for(int i=num; i>0; i=i/10) {
			int rem = i%10; 
			sum = sum+(rem*rem*rem);
		}
		if(sum == num) {
			System.out.println("Given Number " +num + " is an ArmStrong Number");
		}
		else {
			System.out.println("Given number " +num + " Is not an Armstrong Number");
		}

	}

}
