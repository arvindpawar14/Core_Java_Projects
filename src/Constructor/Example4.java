package Constructor;

public class Example4
{
int value1;
int value2;
String Name;
char grade;

Example4(int num1, int num2)
{
	value1 = num1;
	value2 = num2;
}
Example4(String empName)
{
	Name = empName;
}
Example4()
{
	grade ='A';
}
public void Addition()
{
	int sum = value1+value2;
	System.out.println(" Addition Operation:"  + sum);
}
public void multiplication()
{
	int mul= value1*value2;
	System.out.println("Multiplication Operation:"   +mul);
}
public void divide()
{
	int divid= value2/value1;
	System.out.println(" Dividation Operation: "  + divid);
}
public void EmployeeDetails()
{
	System.out.println("Employee Details:"  + Name);
}
public void empRank()
{
	System.out.println("Employee Rank: "   + grade);
}
public static void main(String[]args)
{
	System.out.println("Creating an Object for additon and multiplication, Dividation method using constructor with int parameter");
	Example4 arthimeticOperation = new Example4(20,60);
	arthimeticOperation.Addition();
	arthimeticOperation.multiplication();
	arthimeticOperation.divide();
	
	System.out.println("----------------------------------------------------------------------------------------------------------");
	
	System.out.println("Create an object for the EmployeeDetails using Constructor");
	Example4 empDetails = new Example4("Arvind Pawar");
	empDetails.EmployeeDetails();
	
	System.out.println("----------------------------------------------------------------------------------------------------------");
	
	System.out.println("Create an object for the Employee Information using Constructor");
	Example4 empRank = new Example4();
	empRank.empRank();	
}
}
