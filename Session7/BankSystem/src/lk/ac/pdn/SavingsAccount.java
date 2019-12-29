package lk.ac.pdn;

public class SavingsAccount extends Account {
	
	 
	protected double withdrawLimit;
	
	 SavingsAccount(String accountID, String accountHolder, double amount,double withdraw) {
		  super(accountID, accountHolder, amount); 
		  this.withdrawLimit = withdraw;
	  }
	 
	
	public void setWithdrawLimit(double amount) {
		this.withdrawLimit = amount;
	}
	
	public double getWithdrawalLimit() {
		return withdrawLimit;
	}
	
	@Override
	public double withdraw(double withdrawalamount) {
		 if(withdrawalamount<getWithdrawalLimit() && withdrawalamount<amount) { 
			 amount -=withdrawalamount; 
		 } 
		 return amount; 
		 
	}
		
	
	
	@Override
	public void details() {
		super.details();
		System.out.println("Withdrawal Limit: " + this.getWithdrawalLimit());
	}
}
