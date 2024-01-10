package casting;

public class UpCastingSon extends UpcastingFather 
{
	public void mobile()
	{
		System.out.println("Mobile: Samsung");
	}
	public void money()
	{
		System.out.println("Money:  6L");
	}
	public void car()
	{
		System.out.println("Car: Mercedies");
	}
	public void home()
	{
		System.out.println("Home: 4BHK");
	}
	public static void main(String[] args) 
	{
		UpcastingFather	upCasting = new UpCastingSon();
		upCasting.car();
		upCasting.home();
		upCasting.money();
	}
}
