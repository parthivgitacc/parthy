package org.bank;

public class BankInfo extends AxisBank {

	public void savings() {

		System.out.println("Saving is 10%");
	}
	
	public void fixed()
	{
		System.out.println("Fixed is 15%");
	}
	
	public static void main(String[] args) {
		
		BankInfo b = new BankInfo();
		b.savings();
		b.fixed();
		b.deposit();
	}
}
