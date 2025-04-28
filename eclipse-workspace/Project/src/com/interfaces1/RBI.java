package com.interfaces1;

public interface RBI {
	void withDrawBalance();
	void checkBalance();
	  default void denominationValue() {
		//System.out.println("RBI implements the denominationValue ");
	}
	 static void withDrawLimit() {
		 System.out.println("RBI implements the withdraw limit");
	 }
}

class SBI implements RBI{
	public void withDrawBalance() {
		System.out.println("SBI implementations Withdraw balance");
		
	}
	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("SBI implementations check balance");
		
	}
	
}

class Axis implements RBI{

	@Override
	public void withDrawBalance() {
		// TODO Auto-generated method stub
		System.out.println("Axis implementations Withdraw balance");
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Axis implementations check balance");
		
	}
	
}

class HDFC implements RBI {

	@Override
	public void withDrawBalance() {
		// TODO Auto-generated method stub
		System.out.println("HDFC implementations Withdraw balance");
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		
		System.out.println("HDFC implementations check balance");
	}
	
}
