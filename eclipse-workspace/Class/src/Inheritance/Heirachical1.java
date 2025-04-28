package Inheritance;

public class Heirachical1 extends Heirachical {
	static int no_of_wheels;

	/*
	 * static { no_of_wheels=4; }
	 */
	public void acclerate()
	{
		System.out.println("no_of_weels: "+no_of_wheels);
		System.out.println("Vehicle can acclerate");
	}

}
