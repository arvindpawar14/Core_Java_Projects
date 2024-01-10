package Practice;

public class Example6 {

	public static void main(String[] args) {
		// armStrong Value Program
		int num = 153;
		int sum = 0;
		for(int i=num; i>0; i=i/10) {
			int rem = i % 10;
			sum = sum+(rem*rem*rem);
		}
		if(sum == num) {
			System.out.println("Enter Number is " + num + " is an ArmStrong Number");
		}
		else {
			System.out.println("Enter Number is " + num + " is not a ArmStrong Number");
		}
	}

}
