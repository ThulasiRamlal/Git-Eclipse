package com.inheritance;

public class Bicycle {
	
int gear;
int speed;

public Bicycle(int gear,int speed)
{
	this.gear=gear;
	this.speed=speed;
}

public void applyBrake(int decrement)
{
System.out.println(speed=speed-decrement);	


}

public int speedUp(int increment)
{
return speed=speed+increment;	

}

public String toString()
{
return ("NO of gears are: "+gear+ "\n"+"Speed of bicycle is: "+speed);	

}


}
