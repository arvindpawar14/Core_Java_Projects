package Fibonnices;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b =1;
		for(int i=1; i<=20; i++) {
			int c = a+b;
			System.out.println(a);
			a=b;
			b=c;
		}

	}

}
