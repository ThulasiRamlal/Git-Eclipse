package Oops1;

public class AnonymousObject1 {
	int a=20;
	
	public static void main(String[]args)
	{
		AnonymousObject1 teja= new AnonymousObject1();
		new AnonymousObject1().methodOne();
		new AnonymousObject1().methodTwo("Thulasi", 21);
		System.out.println(new AnonymousObject1().methodThree());
		System.out.println(new AnonymousObject1().methodFour(10, 5));
		System.out.println(new AnonymousObject1().a);
		System.out.println(teja.a);
		
	}
	
	//Type 1 method
	 
	void methodOne()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("methodOne: "+c);
	}
	
	//Type 2 method
	public void methodTwo(String a,int b)
	{
		System.out.println("My self "+a+" and age is :"+b);
	}
	public int methodThree()
	{
		int a=10, b=20;
		int c=10*20;
		return c;
		
	}
	public int methodFour(int a,int b)
	{
		int c= a/b;
		return c;
	}
	
	

	

}
