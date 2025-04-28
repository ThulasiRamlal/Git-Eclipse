package com.anonymousInnerClass;

public class AnimalImpl {
	
	public static void main(String[] args)
	{
		Animal a1=new Animal();
		a1.human();
	
		Animal a=new Animal()
				{

					@Override
					public void human() {
						// TODO Auto-generated method stub
						
						
						System.out.println("Human is a type of animal...");
					System.out.println("===================");
					}
			
	};
	
	a.human();
	
		
}

}
