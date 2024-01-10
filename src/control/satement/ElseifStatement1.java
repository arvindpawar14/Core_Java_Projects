package control.satement;

public class ElseifStatement1
{
	public static void main(String[] args) 
	{
		int stuMarks = 83;
		if(stuMarks <=35)
		{
			System.out.println("Passed");
		}
		else if(stuMarks <=90)
		{
			System.out.println("First Class Distinction");
		}
		else if(stuMarks >=80)
		{
			System.out.println("Second Class Division");
		}
		else if(stuMarks >=70)
		{
			System.out.println("Third Class Division");
		}
		else
		{
			System.out.println("Student is Failed");
		}
	}

}
