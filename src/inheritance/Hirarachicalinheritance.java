package inheritance;

public class Hirarachicalinheritance 
{
	public static void main(String[]args)
	{
		System.out.println("Creating an object of Daughter1/sub class no1");
		Daughter1 gilo= new Daughter1();
		gilo.Mobile();
		gilo.money();
		gilo.home();
		gilo.sares();
		
		System.out.println("Creating an object of Daughter2/sub class no2");
		Daughter2 Hirarachicalinheritance = new Daughter2();
		Hirarachicalinheritance.laptop();
		Hirarachicalinheritance.home();
		Hirarachicalinheritance.money();
		Hirarachicalinheritance.sares();
		
		System.out.println("Creating an object of Daughter3/sub class no3");
		Daughter3 r= new Daughter3();
		r.Car();
		r.home();
		r.sares();
		r.money();	
	}
}
