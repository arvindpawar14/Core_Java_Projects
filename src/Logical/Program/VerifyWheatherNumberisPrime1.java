package Logical.Program;

public class VerifyWheatherNumberisPrime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 55;
		int count = 0;
		for(int i=2; i<num; i++) {
			if(num % i == 0 ) {
				count ++;
				break;
			}
		}
		if (count ==1 ) {
			System.out.println("Given Number "+ num + " is Prime");
		}
		else {
			System.out.println("Given Number "+ num + " is not Prime");
		}
	}

}
