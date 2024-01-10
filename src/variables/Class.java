package variables;

public class Class {
	String Name;
	int rollNo;
	String dep;
	public Class(String Name, int rollNo, String dep) {
		System.out.println("Student Name:" +Name + " Student RollNo:" +rollNo+ " Student Dept:" + dep);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class C = new Class("Arvind Pawar", 1346, "Developer");
		Class C1 = new Class("Rathod Dnyaneshwar", 789, "Java Developer");
		Class C2 = new Class("Abarao Chavhan", 890, "FullStack Java Developer");
		Class C3 = new Class("Pallavi Gupta", 900, "Software Testing");
	}

}
