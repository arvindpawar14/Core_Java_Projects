package interface_implementation;

public class ImplementationClass implements Interface
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
public static void main(String[]args)
{
	ImplementationClass imp = new ImplementationClass();
	imp.m1();
	imp.m2();
	imp.m3();
}
}
