package Practice;

public class ArmStrongExample {

	public static void main(String[] args) {
		int num = 15;
		int sum = 0;
		for(int i=num; i>0; i=i/10) {
			int reg = i % 10;
			sum = sum+ (reg*reg*reg);
		}
		if(sum == num) {
			System.out.println("They are equal "+ num + "are Arm Strong Number");
		}
		else {
			System.out.println( "is not a Armstrong Number" + num +" is "  );
		}

	}

}
