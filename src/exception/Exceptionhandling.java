package exception;

public class Exceptionhandling
{
public static void main(String[] args) 
{
	int a=10;
	int b=0;
	//int div = a/b;
	try {
			System.out.println(a/b);
		}
	catch(ArithmeticException e)
	{
		System.out.println(e);	
	}
}
}
