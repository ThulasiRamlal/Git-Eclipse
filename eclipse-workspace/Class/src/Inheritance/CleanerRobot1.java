package Inheritance;

public class CleanerRobot1 extends Robot1 {
	public void charge()
	{
		//overridden method from Robot1 class
		System.out.println("Cleaner Robot 1 wants charging for working.");
	}
	void cleanHouse()
	{
		// child specfic method
		System.out.println("Cleaner Robot 1 can cleaning houses");
	}
	void cleanUtensils()
	{
		//child specfic method
		System.out.println("Cleaner Robot 1 can cleaning Utensils");
	}

}
