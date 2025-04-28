package Inheritance;

public class DeveloperApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer teja;
	   teja = new JavaDeveloper();
		teja.attendingMeeting();
		teja.doProject();
		
	System.out.println("----------------------------");
	
	Developer teja2 = new PythonDeveloper();
	teja2.attendingMeeting();
	teja2.doProject();
	

	}

}
