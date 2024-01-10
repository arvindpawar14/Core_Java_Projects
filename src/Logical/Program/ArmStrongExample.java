package Logical.Program;

public class ArmStrongExample {

	public static void main(String[] args) {
		int num = 789;
		int add = 0;
		for(int i=num; i>0; i=i/10) {
			int reg = i % 10;
			add = add + (reg*reg*reg);
		}
		if(add == num) {
			System.out.println("The number is an " + add + "is Armstrong Number");
		}
		else {
			System.out.println("The number is an " + add + " is not Armstrong Number");
		}
	}

}
