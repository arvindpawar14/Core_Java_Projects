package this_type;

public class Example2 
{
int num1;
int num2;
String Name;

public Example2 value(int value1, int value2)
{
	this.num1 = value1;
	this.num2 = value2;
	System.out.println(num1*num2);
	
	return this;
}
public Example2 m1() 
{
	this.Name= "Arvind Pawar";
	System.out.println(Name);
	return this;
}
public static void main(String[]args)
{
	Example2 e4 = new Example2();
	e4.value(56, 86);
	e4.m1();
}
}
