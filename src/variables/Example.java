package variables;

import java.util.Scanner;

public class Example {
	static String Name;
	static int rollNo;
	static String dept;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Name=sc.nextLine();
		rollNo= sc.nextInt();
		dept= sc.nextLine();
		System.out.println(Name+  rollNo+ dept);
	}

}
