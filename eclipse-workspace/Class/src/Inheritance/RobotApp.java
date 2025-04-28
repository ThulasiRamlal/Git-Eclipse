package Inheritance;

public class RobotApp {
	public static void main(String[] args) {
		CleanerRobot teja =new CleanerRobot();
		teja.charge();
		teja.talk();
		teja.walk();
		teja.cleanHouse();
		teja.cleanUtensils();
		
		System.out.println("---------------------------");
		
		DoctorRobot teja1= new DoctorRobot();
		teja1.charge();
		teja1.talk();
		teja.walk();
		teja1.giveMedicine();
		teja1.doSurgery();
		
		
	}

}
