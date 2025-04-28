package com.interfaces2;

public interface Banking {
	public void withdrawl();
	public void checkBalance();
	public static void neft() {
		System.out.println("Banking implements the NEFT sytem");
	}
	default public void pinChange() {
		System.out.println("Banking implements the Pin Chabge options");
	}

}

class Axis implements Banking{

	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		System.out.println("Axis Bank implements withdrawl");
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Axis bank implements checkBalance");
	}
}

class Sbi implements Banking{

	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		System.out.println("SBI bank implements the withdrawl");
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("SBI bank implements the CheckBalance");	
	}
}

class HDFC implements Banking{

	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		System.out.println("HDFC bank implements the Withdrawl");
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("HDFC bank implements the CheckBalance");	
	}	
}
class Banking1{
	public void acceptBanks(Banking ref) {
		ref.checkBalance();
		ref.checkBalance();
		Banking.neft();
		ref.pinChange();
	}
}


