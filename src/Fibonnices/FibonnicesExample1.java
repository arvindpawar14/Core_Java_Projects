package Fibonnices;

public class FibonnicesExample1 {

	public static void main(String[] args) {
		int n =10;
		int firstTerm = 0;
		int SecondTerm = 1;
		int nextTerm;
		
		for(int i=1; i<=n; ++i) {
			nextTerm =  firstTerm + SecondTerm;
			System.out.print(firstTerm+" ");
			firstTerm = SecondTerm;
			SecondTerm = nextTerm;
		}
	}

}
