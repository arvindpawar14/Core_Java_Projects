package Logical.Program;

public class ArmStrongExample3 {

	public static void main(String[] args) {
		int num = 7890;
		int sum = 0;
		for(int i=num; i>0; i=i/10) {
			int reg = i/10;
			sum = sum+(reg*reg*reg*reg);
		}
		if(num==sum) {
			System.out.println("Entered Number "+ num + " Are an ArmStrong Number");
		}
		else {
			System.out.println("Entered Number "+ num + " Are not an ArmStrong Number");
		}
		
	}

}
