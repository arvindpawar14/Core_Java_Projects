package control.satement;

public class SwitchStatement {

	public static void main(String[] args) 
	{
		String atmFunctionality = "Money Transfer";
		switch(atmFunctionality)
		{
		case "Money Transfer": System.out.println("Operation money Transfer");
		break;
		case "Cash Widhrawal": System.out.println("Operation Cash Widhrwal");
		break;
		case "pin Change": System.out.println("Operation pin Change");
		break;
		case "Balance Inquary": System.out.println("Operation Balance Inquary");
		break;
		default: System.out.println("input is invalid");
		break;
		}
	}
}
