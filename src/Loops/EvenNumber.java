package Loops;

public class EvenNumber {

	public static void main(String[] args) {
		
		for(int i=0; i<=100; i++) {
			if(i%2==0) {
				int count=0;
				System.out.println(count+i);
			}
			else {
				System.out.println("Odd Number: "+i);
			}
		}

	}

}
