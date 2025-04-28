package Oops1;

public class AnonymousObjects {
	int lapId;
	String brand;
	String colour;
	String processor;
	double price;
	void SwitchOn()
	{
		System.out.println("Laptop switched on");
	}
	void laptopDetails()
	{
		System.out.println("lapId :"+lapId);
		System.out.println("Brand :"+brand);
		System.out.println("colour :"+colour);
		System.out.println("processor:"+processor);
		System.out.println("price :"+price);
	}
	public void methodTwo()
	{
		System.out.println("My name is Thulasi Ramlal");
	}
	public static void main(String[] args)
	{
		AnonymousObjects teja=new AnonymousObjects();
		teja.SwitchOn();
		teja.lapId=120;
		teja.brand="apple";
		teja.colour="black";
		teja.processor="Snapdraon";
		teja.price=29999.9;
		teja.laptopDetails();
		new AnonymousObjects().SwitchOn();
		//new AnonymousObjects().methodTwo();
		teja.methodTwo();
	}
}
