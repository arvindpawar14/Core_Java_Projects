package Access.Specifier;

public class Example 
{
/*
 *  Private Access Specifier
 */
	private int a=20;
	
	private void m1()
	{
		System.out.println("Running Method m1 from Class Example");
		
	}
	public static void main(String[]args)
	{
		Example e1 = new Example();     //Private access specifiers scope is limited to that class only
		e1.m1();
		System.out.println(e1.a);
	}
}
