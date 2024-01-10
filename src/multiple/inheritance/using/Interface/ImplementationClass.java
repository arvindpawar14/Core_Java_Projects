package multiple.inheritance.using.Interface;

public class ImplementationClass implements Interface1, Interface2
{
	public void m1()
	{
		System.out.println("Completed method m1 in the Implementation Class");
	}
	public void m2()
	{
		System.out.println("Completed method m2 in the Implementation Class");
	}
	public void m3()
	{
		System.out.println("Completed method m3 in the Implementation Class");
	}
	public void m4()
	{
		System.out.println("Completed method m4 in the Implementation Class");
	}
	public void m5() 
	{
		System.out.println("Completed method m5 in the Implementation Class");
	}
	public static void main(String[]args)
	{
		ImplementationClass mulInheritance = new ImplementationClass();
		mulInheritance.m1();
		mulInheritance.m2();
		mulInheritance.m3();
		mulInheritance.m4();
		mulInheritance.m5();
	}

}
