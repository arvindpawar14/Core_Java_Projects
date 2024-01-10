package Logical.Program;

public class ArmstrongExample1 {

	public static void main(String[] args) {
		int num = 90;
		int sum = 0;
		for(int i=num; i>0; i=i/10) {
			int rem = i/10;
			sum= sum+(rem*rem);
		}
		if(num == sum) {
			System.out.println(" Given Number "+ num + " is an Armstrong Number");
		}
		else {
			System.out.println(" Given Number "+ num + " is not an Armstrong Number");
		}
	}

}
