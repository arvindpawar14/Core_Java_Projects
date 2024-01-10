package Fibonnices;

public class FibonnicesExample {

	public static void main(String[] args) {
		int FirstValue =0;
		int SecondValue =1;
		int n = 13;
		System.out.println("Fibonnices Examples");
		for(int i=0; i<=n; i++) {
			int FinalValue = FirstValue + SecondValue;
			System.out.print(FirstValue+" ");
			FirstValue = SecondValue;
			SecondValue = FinalValue;
		}
	}
}
