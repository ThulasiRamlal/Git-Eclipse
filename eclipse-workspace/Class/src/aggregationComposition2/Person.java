package aggregationComposition2;

public class Person extends Human {	
		// TODO Auto-generated method stub
	String id ="N180434";
	String name = "Thulasi";
	String gender = "Male";
	public void eat()
	{
		System.out.println("Person: Person need food.");
	}
	public void walk()
	{
		System.out.println("Person : person is walking.");
	}
	
	
	Brain br = new Brain();
	Heart hr =new Heart();



}
