package com.miniproject;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class ATmOperationimpl2 implements AtmOperation {
	Atm atm=new Atm();
	
   Map<Double,String>mini=new HashMap<Double,String>();

	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("REMAINING BALANCE: "+atm.getBalance());
		
	}

	@Override
	public void withDrawn(double withdrawn) {
		// TODO Auto-generated method stub
		if(withdrawn%500==0)
		{
			if(withdrawn<=atm.getBalance())
			{
		mini.put(withdrawn, "Withdrawn");
		System.out.println("WITHDRAWN SUCCESFULL: "+withdrawn);
		atm.setBalance(atm.getBalance()-withdrawn);
		viewBalance();
			}
			else
			{
				System.out.println("INSUFFICIENT BALANCE");
			}
		}
		else
		{
			System.out.println("PLEASE ENTER AMOUNT IN MULTIPLE IN 500");
			
		}
		
	}

	@Override
	public void deposit(double deposit) {
		// TODO Auto-generated method stub
		
		System.out.println("DEPOSIT SUCCESFULL: "+deposit);
		atm.setDepositAmount(atm.getBalance()+deposit);
		mini.put(deposit, "Deposit");
		viewBalance();
		
	}

	@Override
	public void ministatement() {
		// TODO Auto-generated method stub
		Set<Double>set=mini.keySet();
		for(Double i:set)
		{
			System.out.println(i+"="+mini.get(i));
		}
		
	}
	

}
