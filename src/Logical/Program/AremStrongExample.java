package Logical.Program;

public class AremStrongExample {

	public static void main(String[] args) {
	int num = 678;
	int sum =0;
	for(int i=num; i>0; i=i/10) {
		int rem= i/10;
		sum= sum+(rem*rem*rem);
	}
	if(sum == num) {
		System.out.println("Given Number "+ num + " is an Armstrong Number");
	}
	else {
		System.out.println("Given Number "+ num+ " is not an Armstrong Number");
	}
	}

}
