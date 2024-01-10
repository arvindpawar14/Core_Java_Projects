package casting;

public class ImplicitCasting 
{
	int a = 20;
	double b=a;
	
	public void lowerdataTohigherdataType()
	{
		System.out.println(b);
	}
	public static void main(String[] args)
	{
		ImplicitCasting impCasting = new ImplicitCasting();
		impCasting.lowerdataTohigherdataType();
	}
}
