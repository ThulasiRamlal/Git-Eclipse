package Abstraction;

public  class AbstractClass6 implements AbstarctClass5 {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("method1............");
		
	}

	
	  @Override public void method2() { // TODO Auto-generated method stub
	  System.out.println("--------");
	  }
	 
	public static void main(String[] args) {
		AbstractClass6 teja = new AbstractClass6();
		teja.method1();
		teja.method2();
		AbstarctClass5.method4();
	    teja.method5();
	}

}
