package Logical.Program;

public class ArmStrongExample2 {

	public static void main(String[] args) {
	int num = 87689;
	int sum = 0;
	for(int i=num; i>0; i=i/10) {
		int reg = i/10;
		sum = sum+(reg*reg*reg*reg*reg);
	}
	if(num == sum) {
		System.out.println(" Given Number "+ num + " is an Armstrong Number");
	}
	else {
		System.out.println(" Given Number "+ num + " is not an Armstrong Number");
	}
	}

}
