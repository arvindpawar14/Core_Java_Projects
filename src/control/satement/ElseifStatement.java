package control.satement;

public class ElseifStatement {

	public static void main(String[] args) 
	{
		int stuMarks = 68;
		if(stuMarks <= 35)
		{
			System.out.println("Topper");
		}
		else if(stuMarks >= 70)
		{
			System.out.println(" Class Distinction");
		}
		else if(stuMarks >= 65)
		{
			System.out.println("First  Class Distinction");
		}
		else if(stuMarks >= 35)
		{
			System.out.println("The Student is Passed");
		}
		else
		{
			System.out.println("Student is Failed");
		}
	}

}
