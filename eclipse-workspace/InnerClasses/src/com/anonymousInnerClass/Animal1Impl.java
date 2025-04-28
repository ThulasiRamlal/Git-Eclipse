package com.anonymousInnerClass;

public class Animal1Impl {
	
	public static void main(String[] args) {
		
		Animal1 a=new Animal1()
				{

					@Override
					public void show() {
						System.out.println("show method executed from Animal1Impl Class");
						
						
					}
			
				};
				a.show();
		
		
	}

}
