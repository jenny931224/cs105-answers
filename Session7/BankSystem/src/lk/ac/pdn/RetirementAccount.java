package lk.ac.pdn;

import java.util.Calendar;

public class RetirementAccount extends Account {
	
	  RetirementAccount(String accountID, String accountHolder, double amount) {
	  super(accountID, accountHolder, amount); }
	 
	private int yearOfRetirement;
	private double bonusPercent;
	int year = Calendar.getInstance().get(Calendar.YEAR);
	int additionalYears;
	
	RetirementAccount(int year, double bonusPercent){
		this.yearOfRetirement = year;
		this.bonusPercent = bonusPercent;
	}// values can be directly assigned using constructor getter setter methods below
	
	public void setBonusPercent(double bonusPercent) {
		this.bonusPercent = bonusPercent;
	}
	public double getBonusPercent() {
		return this.bonusPercent;
	}
	
	public void setYearOfRetirement(int year) {
		this.yearOfRetirement = year;
	}
	
	public int getYearOfRetirement() {
		return this.yearOfRetirement;
	}
	
	public int calAdditionalYears() {
		additionalYears = getYearOfRetirement() - year;
		return additionalYears;
	}
	
	public double calculateBonus(double bonus) {
		bonus = additionalYears * getBonusPercent();
		return bonus;
	}
	
		public double withdraw(double withdrawAmount, int year) {
			System.out.println("Year of retirement: " + getYearOfRetirement());
			if(withdrawAmount<amount && getYearOfRetirement() == year) {
				amount -= withdrawAmount;
			}
			return amount;
		}

		public void details() {
			super.details();
			System.out.println("Year of Retirement: " + this.getYearOfRetirement());
			System.out.println("Bonus Percent: " + this.getBonusPercent());
		}
}
