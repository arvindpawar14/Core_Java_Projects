package Abstract_ConcerateClass;

public class CompleteClass extends IncompleteClass 
{
	public void m1()
	{
		System.out.println("Running method m1 from Incomplete/Abstract Class");
	}
	public void m2()
	{
		System.out.println("Implemented MEthod m2 From Incomplete Class");
	}
	public void m3()
	{
		System.out.println("Implemented method m3 in the concrete class");
	}
	public static void main(String[]Args)
	{
		CompleteClass e2 = new CompleteClass();
		e2.m1();
		e2.m2();
		e2.m3();
	}
}
