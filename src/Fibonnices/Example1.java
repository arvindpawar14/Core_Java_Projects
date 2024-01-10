package Fibonnices;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		System.out.print(a+" ");
		for(int i=0; i<=10; i++) {
			int c = a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

	}

}
