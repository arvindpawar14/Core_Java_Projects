package LogicalProgramPractice;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int c = 0;
		int n,a;
		System.out.println("ArmStrong Number are");
		for(int i=1; i<=1000; i++) {
			n =i;
			while(n>0) {
				a = n % 10;
				n = n/10;
				c = c+(a*a*a);
			}
		if(c == i) {
			System.out.println(i+ " ");
		}
		c=0;
		}
	}

}
