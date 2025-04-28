package Inheritance;

public class RoboApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DoctorRobot1 teja = new DoctorRobot1();
		 teja.talk();
		 teja.charge();
		 teja.walk();
		 teja.charge();
		 teja.doSurgery();
		 System.out.println("-------------------------");
		 
		 CleanerRobot1 teja2 = new CleanerRobot1();
		 teja2.talk();
		 teja2.charge();
		 teja2.walk();
		 teja2.cleanHouse();
		 teja.doSurgery();
		 
		

	}

}
