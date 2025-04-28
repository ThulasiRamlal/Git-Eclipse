package com.constructors;

public class Notification {
	String message;
	int repeatCount;  
	boolean hasCustomMessage; 

	Notification(){
		System.out.println("+++++++++++++++++++++++++++");
	}
	Notification(String message)
	{
		this.message=message;
	}
	Notification(String message,int repeatCount, boolean hasCustomMessage)
	{
		this.message=message;
		this.repeatCount=repeatCount;
		this.hasCustomMessage=hasCustomMessage;
	}
	public void dispaly()
	{
		System.out.println("messsage: "+message+" repeatCount "+repeatCount+" hasCustomMessage "+hasCustomMessage);
		
	}
	/*
	 * public void displayNotification() { if(repeatCount>0) {
	 * System.out.println("print"); } }
	 */
	
	public static void main(String[] args) {
		Notification teja = new Notification();
		teja.dispaly();
		System.out.println("------------------------");
		Notification teja2= new Notification("teja");
		teja2.dispaly();
		System.out.println("------------------------");
		Notification teja3=new Notification("Thulasi",20,true);
		teja3.dispaly();
		
	}
}
