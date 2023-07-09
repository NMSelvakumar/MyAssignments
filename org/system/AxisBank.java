package org.system;

public class AxisBank extends BankInfo {
	
	@Override
	public void deposit() {
		System.out.println("Deposit Function --> AxisBank");
		//super.deposit();
	}
	
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.deposit();
	}

}
