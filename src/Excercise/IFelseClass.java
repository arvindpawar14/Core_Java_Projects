package Excercise;

import java.util.Scanner;

public class IFelseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int pin = sc.nextInt();
		if(pin == 1234) {
			System.out.println("Even ");
		}
		else {
			System.out.println("Odd");
		}

	}

}
