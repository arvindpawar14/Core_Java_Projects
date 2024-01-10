package this_type;

public class Example6
{
int square(int num) 
{
return num*num;
}
public static void main (String[]args)
{
	Example6 r = new Example6();
	int squareOfNumbers= r.square(76);
	
	System.out.println("Square of 76: " +squareOfNumbers);
}
}
