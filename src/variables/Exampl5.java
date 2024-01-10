package variables;

import java.util.Scanner;

public class Exampl5 {
	String name;
	String MiddleName;
	String FatherName;
	int MobileNo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exampl5 e3 = new Exampl5();
		//System.out.println("------");
		Scanner sc = new Scanner(System.in);
		e3.name= sc.next();
		System.out.println("Enter Name: " +e3.name);
		e3.MiddleName = sc.next();
		System.out.println("MiddleName: "+ e3.MiddleName);
		e3.FatherName = sc.next();
		System.out.println("FatherName: "+e3.FatherName);
		e3.MobileNo = sc.nextInt();
		System.out.println("Enter Mobile No: "+e3.MobileNo);

	}

}
