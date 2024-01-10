package variables;

public class College1 {
	String dept;
	String name;
	int rollNo;
	public College1 (String dept, String name, int rollNo)
	{
		System.out.println("Department=" + dept + " Name="+ name + "" + " RollNo=" + rollNo + " " );
	}
	public static void main(String[] args) {
		College1 c1 = new College1("Java", "Arvind Pawar", 1234);
		College1 c2 = new College1("Java Development ", "Rathod Dnyaneshwar ", 6750);
		College1 c3 = new College1("fullStack Development ", "Pravin Pawar ", 1324);
		College1 c4 = new College1("Software Tester ", "Arvind Pawar ", 1456);
	}
}
