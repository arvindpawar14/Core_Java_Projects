package Logical.Program;

public class VerifyWheatherNumberisPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 20;
		int count = 0;
		for(int i=2; i<num; i++) {
			if(num % i == 0 ) {
				count++;
				break;
			}
		}
		if(count == 1) {
			System.out.println("Given Number " + num + " is not a Prime Number");
		}
		else {
			System.out.println("Given Number " + num + " is a Prime Number");
		}
	}

}
