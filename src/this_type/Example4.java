package this_type;

public class Example4 extends Example3
{
String Colour= "Yellow";

public void colourPattern()
{
	String colour = "Blue";
	System.out.println("The method colour is: " + colour);
	System.out.println("The Global Colour Method is: " + this.Colour);
	System.out.println(" Other Class Colour is: " + super.Colour);
}
public static void main(String[]args)
{
	Example4 r = new Example4();
	r.colourPattern();
	
}
}
