


package com.javaBasics;

public class Variables {
	public static void main(String[] args) {
		Variables c=new Variables(); 
		c.variables();
		System.out.println("Static variable: "+c.c);
}
	
	
public  void variables()
{
	// variable :- variable are the name given to memory location to store the the data and retierview the data
	//Local variable :-local variables are the type of variables which are declared inside class and inside method....
	//Instance variables :-instance variable are the type of variables are declared inside class and outside metod..
	//Static variable :- Static variable are the variables are declared inside class and outside method along with static keyword.
	
	int a=10;
	System.out.println("Local variable: "+a);
	System.out.println("Instance variable: "+b);
	System.out.println("Static varibale: "+c);
	

}
//Instance variable
int b=10;

//Static variable

static int c=20;


//=======================================================================================================================

//Data Types :-data types are mechanisim which are used declared variable and defining it's type.
//1.Primitive data type :-primitive data type of data type which are hold the actual value of variable.
//2.Non-Primitive variable:-Non-primitive data type is type of data type  which are holds refernce of variabes..
//
//Datatype         default values           size(bytes)
//1.byte              0                       1 
//2.short             0                       2
//3.int               0                       4
//4.long              0l                      8
//5.float             0.0                     4
//6.double            0.0d                    8
//7.char              single space            2
//8.boolean           false                   depends on jvm

	
	
}