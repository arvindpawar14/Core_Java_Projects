package inheritance;

public class Progerammer extends Employee
{
	int bonus = 10000;
	public static void main(String[] args)
	{
		Progerammer p = new Progerammer();
		System.out.println("Employes Salary: "  +p.Salary);
		System.out.println("Employes Bonus: "  +p.bonus);
	}
}
