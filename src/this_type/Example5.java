package this_type;

public class Example5 
{
int num1;
int num2;
public void value(int value1, int value2)
{
	this.num1 = value1;
	this.num2 = value2;
	System.out.println(num1+num2);
	System.out.println(num2-num1);
	System.out.println(num1*num2);
	System.out.println(num2/num1);	
}
public int value(int value1)
{
	this.num1 = value1;
	return num1;
}
public static void main(String[]args)
{
	Example5 s = new Example5();
	int intvalue = s.value(60);
			System.out.println(intvalue);
}
}
