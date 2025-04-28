package com.inheritance;

public class MountainBikeTest {
	public static void main(String[] args) {
		
		MountainBike m=new MountainBike(3, 100, 25);
		System.out.println(m.toString());
		m.applyBrake(10);
		System.out.println(m.speedUp(10));
	}

}
