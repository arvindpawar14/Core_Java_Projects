package this_type;

public class Example1 
{
int num1;
int num2;

public void value(int value1, int value2)
{
	this.num1 = value1;
	this.num2 = value2;
	System.out.println(num1+num2);
}
public static void main(String[]args)
{
	Example1 e3 = new Example1();
	e3.value(26, 34);
}
}
