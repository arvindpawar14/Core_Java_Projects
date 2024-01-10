package Constructor;

public class Example3 
{
int num1;
int num2;

Example3(int a, int b)
{
	num1= a;
	num2= b;
}
public void multiplication()
{
	int mul = num1*num2;
	System.out.println("Multiplication Operation:"  + mul);
}
public void addition()
{
	int add = num1+num2;
	System.out.println("Addition Operation:"  + add);
}
public static void main(String[]args)
{
	Example3 multiOperation= new Example3(20, 60);
	multiOperation.addition();
	multiOperation.multiplication();			
}

}
