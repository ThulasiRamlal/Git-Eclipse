package comlamdaExpression;

public interface Lamda1 {
	public String method1();
	public static void method2()
	{
		System.out.println("Lamda1 static method");
	}
	default void method3()
	{
		System.out.println("Lamda3 default method");
	}

}
