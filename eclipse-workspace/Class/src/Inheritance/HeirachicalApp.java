package Inheritance;

public class HeirachicalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Heirachical cr = new Heirachical();//Parent class
		Heirachical.speed=100.0;
		cr.start();
		
		Heirachical1 teja1 = new Heirachical1();//Child class1
		Heirachical1.no_of_wheels=4;
		teja1.acclerate();
		
		Heirachical2 teja2 = new Heirachical2();//Child cass2
		Heirachical2.engNo=4;
		
		teja2.stop();
		

	}

}
