package com.miniproject;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;

public class ATMOperationImpl implements AtmOperation {

	Atm atm=new Atm();
	Map<Double,String>mini=new HashMap<>();
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
				mini.put(withdrawn, "AmountWithDrawn");
				System.out.println("WITHDRAWN SUCCESFULL: "+withdrawn);
			atm.setBalance(atm.getBalance()-(withdrawn));
			viewBalance();
			}
			else
			{
				System.out.println("INSUFFICIENT AMOUNT IN YOUR ACCOUNT ");
			}
		}
		else
		{
			
			System.out.println("PLEASE ENTER AMOUNT IN MULTIPLE OF 500");
		}
		
	}

	@Override
	public void deposit(double deposit) {
		if(deposit%500==0)
		{
		// TODO Auto-generated method stu
		mini.put(deposit,"Amountdeposited");
		//double bal=atm.getBalance()+deposit;
	
		System.out.println("DEPOSIT SUCCESFULL  : "+deposit);
		atm.setBalance(atm.getBalance()+(deposit));
		viewBalance();
		}
		else
		{
			System.out.println("ATM ACCEPTS ONLY 500 NOTES");
		}
		
	}

	@Override
	public void ministatement() {
		// TODO Auto-generated method stub
		Set<Double>set=mini.keySet();

				for(Double d:set)
				{
					System.out.println(d+" "+mini.get(d));
				}
				viewBalance();
	}

}
