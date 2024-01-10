package LogicalOperator;

public class Not_Equal_toOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 10;
		String s1 = "Arvind Pawar";
		String s2 = "Dnyaneshwar Rathod";
		String s3 = "Arvind Pawar";
		System.out.println("Display Value: "+a);
		System.out.println("Display Value: "+b);
		System.out.println("Display Value: "+c);
		System.out.println("Comparision a==b: "+(a!=b));
		System.out.println("Comparision a==c: "+(a!=c));
		System.out.println("Comparision b==c: "+(b!=c));
		System.out.println("Comparision s1==s2: "+(s1!=s2));
		System.out.println("Comparision s2==s3: "+(s2!=s3));
		System.out.println("Comparision s3==s1: "+(s3!=s1));
	}

}
