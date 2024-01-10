package control.satement;

public class NEstediStatement
{ 

	public static void main(String[] args) 
	{
	
		/**
		 * NEsted if
		 */
		String username = "pawararvind92@gmail.com";
		String password = "Pawar@12435";
		if(username == "pawararvind92@gmail.com")
		{
			System.out.println("username is Correct");
			System.out.println("Please enter Password");
			if(password == "Pawar@12435")
			{
				System.out.println("PAssword is valid");
				System.out.println("Please Click on login Button");
			}
			else
			{
				System.out.println("Password is invalid");
				System.out.println("Please enter Password again");
			}
		 }
		else
		{
			System.out.println("username is invalid");
			System.out.println("enter username again");
		}
	}
	
}
