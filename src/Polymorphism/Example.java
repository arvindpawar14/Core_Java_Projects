package Polymorphism;

public class Example 
{
	/*
	 *  method overloading ----> Example of Compile time Polymorphism
	 */
	public void TestingMetrology()
	{
		System.out.println("Testing Metrology");
	}
	public void TestingMetrology(String InitialTesting)
	{
		System.out.println(" initial Testing Type: "  + InitialTesting);
	}
	public void TestingMetrology(char TestingRank)
	{
		System.out.println("Testing Rank: " + TestingRank);
	}
	
	public static void main(String[]args)
	{
		Example gilo = new Example();
		gilo.TestingMetrology();
		gilo.TestingMetrology("Arvind");
		gilo.TestingMetrology('B');
	}
}
