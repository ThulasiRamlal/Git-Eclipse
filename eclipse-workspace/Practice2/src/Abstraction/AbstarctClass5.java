package Abstraction;

public interface AbstarctClass5 {
	public abstract void method1();
	public abstract void method2();
	public static void method4() {
		System.out.println("method4......");
	}
	default public void method5()
	{
		System.out.println("method5........");
	}

}
