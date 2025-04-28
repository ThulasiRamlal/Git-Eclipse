package com.has_A_Relation;

public class Mobile {
  String brand;
  String color;
  int cost;
  {
	  brand="Asus";
	  
	 color="Blue";
	 cost=12000;
  }
  void mobile()
  {
	  System.out.println("Brand: "+brand+" color: "+color+" cost: "+cost);
	  
  }
  Os teja2=new Os();
  public static void main(String[] args) {
	  Mobile teja=new Mobile();
	
	teja.mobile();
	teja.teja2.os();
	
	
}
  

}
