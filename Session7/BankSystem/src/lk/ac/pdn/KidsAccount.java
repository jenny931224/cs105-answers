package lk.ac.pdn;

public class KidsAccount extends SavingsAccount {
	KidsAccount(String accountID, String accountHolder, double amount, double withdrawLimit,String guardian) {
		super(accountID, accountHolder, amount, withdrawLimit);
		this.guardian = guardian;
	}

	private String guardian;
	
	public void setGuardian(String guardian) {
		this.guardian = guardian;
	}
	
	public String getGuardian() {
		return this.guardian;
	}
	
	public void withdraw(double withdrawAmount, String guardian) {
		System.out.println("You can only withdraw if you specify a guardian\n");
		System.out.println("Guardian of child: " + guardian);
		if(withdrawAmount<amount && getGuardian() == guardian) {
			amount -= withdrawAmount;
		}
	
	}
}
