package Scanner;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String name = sc.next();
		//float f= sc.nextFloat();
		int sum = a+b;
		int mul = a*b;
		int sub = a-b;
		int div = a/b;
		//System.out.println(f);
		System.out.println(name);
		System.out.println(sum);
		System.out.println(mul);
		System.out.println(sub);
		System.out.println(div);
	}

}
