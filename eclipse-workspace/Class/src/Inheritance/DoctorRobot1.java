package Inheritance;

public class DoctorRobot1 extends Robot1 {
	public void charge()
	{
		//overidden method
		System.out.println("Doctor Robot 1 wants charging.");
	}
	public void giveMedicine()
	{
		//child specfic method
		System.out.println("Doctor Robot 1 can gives medicines");
	}
	public void doSurgery()
	{
		System.out.println("Docotr Robot 1 can do surgery.");
	}
	

}
