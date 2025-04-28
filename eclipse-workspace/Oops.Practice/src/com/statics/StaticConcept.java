package com.statics;

public class StaticConcept {
	public static void main(String[] args) {
		StaticConcept.display(id, name);
		System.out.println("-------------------------------");
		
		new StaticConcept().display2(id, name);
		
		
		
	}
	//static variable accessble inside Static blocks and static methods
	static int id;
	static String name;
static int age;
static int age2=10;
	

static//static block-->>it is used to insatiate the in static variables 
//and it invoke the before main method
{
	System.out.println("Inside the the Static block");
	id=180434;
	name="Thulasi";
	
}
static void display(int a, String b)
{
	System.out.println("Inside the dispaly method");
	a=id;
	b=name;
	System.out.println("My id: "+id+" name is: "+name);
}
//-----------------------------------------------------------------

//non-static  
//instance variable
int id1;
String name1;
//non-static block
{
	int age=19;
	System.out.println("age: "+age);
	int id1=180427;
	String name1="teja";
	System.out.println("Inside the Non-static block");
}
public void display2(int a1,String b1)
{
	System.out.println("static int age2"+age);
	System.out.println("Inside the Non-static block");
	a1=id1;
	b1=name1;
	//c1=age;
	System.out.println("My id: "+id+" name is "+name+" age is: "+age);
}



}
