package Loops;

public class ForLoops {

	public static void main(String[] args) {

		//System.out.println("*\n**\n***\n****");
		for(int i=1; i<=5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
