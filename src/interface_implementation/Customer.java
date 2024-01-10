package interface_implementation;

public class Customer implements FinanceCustomer,BankCustomer {

	@Override
	public void Deposit() {
		System.out.println("Deposite 1cr");
		
	}
	public static void main(String[] args) {
		Customer cus = new Customer();
		cus.Deposit();
	}

}
