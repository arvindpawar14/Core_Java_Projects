package encapsulation;

public class Balanceenquary {
		/**
		 * Encapsulation ---> Data hiding from other classes
		 */
		private double availableBalance;
		public void setBalance(double settleAmount){
			this.availableBalance = settleAmount;
		}
		public double getBalance()
		{
			return availableBalance;
		}
		public static void main(String[]args)
		{
			Balanceenquary b1 = new Balanceenquary();
			b1.setBalance(456.45);
			System.out.println("Availbale Balance: "  +b1.getBalance());
		}
	}


