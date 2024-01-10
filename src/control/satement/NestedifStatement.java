package control.satement;

public class NestedifStatement 
{
 public static void main(String[] args)
 {
	String username = "appawar1436@gmail.com";
	String password = "Arpnid@6545";
	if(username == "appawar1436@gmail.com")
	{
		System.out.println("username is correct");
		System.out.println("Please enter password ");
		if(password == "Arpnid@6545")
		{
			System.out.println("password is valid");
			System.out.println("Please clik on login Button");
		}
	}
	else
	{
		System.out.println("Password is invalid");
		System.out.println("Please enter password again");
	}
 }
}
