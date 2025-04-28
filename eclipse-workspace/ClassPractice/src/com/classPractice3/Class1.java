package com.classPractice3;

public abstract class Class1 {
	String title;
	String author;
	int publicationYear;
	public abstract void displayDetails();
	public abstract void calculateRentalFee();

}

//----------------------------------------
class Book extends Class1{
 
	int isBn;
	int numberOfPages;
	
	
	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Title: "+title+" author: "+author+" publicationYear: "+publicationYear);
	}

	@Override
	public void calculateRentalFee() {
		// TODO Auto-generated method stub
		
	}
	
}
