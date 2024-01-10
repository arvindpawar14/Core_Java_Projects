package this_type;

public class Example
{
	/*
	 * This keyword used
	 */
	//global Values
	int num1 =60;     // instance Class Variables
	String empName ="Arvind Pawar"; // static Varibles
	
	public void keyword()
	{
		int num1 = 34;       // Local variables
		System.out.println(num1);
		System.out.println(this.num1);
		System.out.println(this.empName);
	}
	public static void main(String[]args)
	{
		Example e = new Example();
		e.keyword();
		
	}
}
