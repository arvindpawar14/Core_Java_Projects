package Polymorphism;

public class Son extends Father
{
public void Money()
{
	System.out.println("Money:  8L");
}
public void Home()
{
	System.out.println("Home : 2BHK");
}
public static void main(String[]args)
{
 Son overridingMetrology = new Son();
 overridingMetrology.Money();
 overridingMetrology.Home();
 overridingMetrology.Car();
}
}
