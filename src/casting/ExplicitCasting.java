package casting;

public class ExplicitCasting 
{
	double a= 42.2;
	int b=(int)a;
	
	public void higherTolower()
	{
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		ExplicitCasting Explicit = new ExplicitCasting();
		Explicit.higherTolower();
	}
	
}
