package LogicalProgramPractice;

public class ArmStrongNumberex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153;
		int sum = 0;
		for(int i=num; i>0; i=i/10) {
			int rem = i % 10;
			sum = sum+(rem*rem*rem);
		}
			if(sum == num) 
			{
				System.out.println("Given numer "+ num + " is Armstron");
			}
			else {
				System.out.println("Given numer "+ num + " is not Armstron");
			}
		}

	}


