package com.has_A_Relation;

public class MobileApp {

	public static void main(String[]args)
	{
		Mobile t=new Mobile();
		t.mobile();
		System.out.println("====Composition=======");
		t.teja2.os();
	   System.out.println("======Aggregation==========");
	   Charger t2=new Charger();
	   t2.charger();
	  
	}
}
