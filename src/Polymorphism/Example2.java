package Polymorphism;

public class Example2 
{
/*
 *  Method Overriding Example
 */
	
	public void Health()
	{
		System.out.println("Health is good");
	}
	public void Health(Boolean value)
	{
		System.out.println("Condition is Bad: " +value);
	}
	public void Health(String Arvind)
	{
		System.out.println("Patient Name: "  +Arvind);
	}
	public static void main(String[]args)
	{
		Example2 Hospital = new Example2();
		Hospital.Health();
		Hospital.Health(true);
		Hospital.Health("Arvind");
	}
}
