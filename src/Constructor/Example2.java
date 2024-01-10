package Constructor;

public class Example2 
{
int num1;
int num2;
Example2()
{
	num1= 10;
	num2 = 20;
}
public void addition()
{
	int sum = num1+num2;
	System.out.println("Addition Operation:" + sum);
}
public void multiplication()
{
	int mul = num1*num2;
	System.out.println("Multiplication Operation: "   + mul);
}
public static void main(String[]Arg)
{
	Example2 arthimetic = new Example2();
	arthimetic.addition();
	arthimetic.multiplication();
}
}
