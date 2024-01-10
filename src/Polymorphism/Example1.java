package Polymorphism;

public class Example1 
{
	/*
	 *  Main Method Overloading
	 */
	public static void main(String[]args)
	{
		main(24, 56);
		main(true);
	}
	
	public static void main(int num1, int num2)
	{
		int sum = num1+num2;
		System.out.println(" Addition Method: "  + sum);
	}
	public static void main(Boolean value)
	{
		System.out.println(value);
	}
}
