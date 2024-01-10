package LogicalProgramPractice;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 98654;
		int sum =0;
		for(int i=num; i>0; i=i/10) {
			int rem = i % 10;
			sum = sum*10+rem;
		}
	}

}
