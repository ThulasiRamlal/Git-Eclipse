package Abstraction;

public  class AbstarctClass4 extends AbstractClass3{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("metod1 printing..........");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method2 printing.............");
		
	}
	public static void main(String[] args) {
		AbstarctClass4 teja=new AbstarctClass4();
		//AbstractClass3 teja2=new AbstractClass3();
		teja.method1();
		teja.method2();
		teja.method3();
		teja.method4();
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("method4.............");
		
	}
	

}
