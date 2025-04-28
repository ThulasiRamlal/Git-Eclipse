package com.comperator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator2  {
	int id;
	String name;
	int age;

 public Comparator2(int id,String name,int age)
 {
	 this.id=id;
	 this.name=name;
	 this.age=age;
 }
   public String toString() {
	  
	  return ("id: "+id+" name: "+name+" age: "+age);
	  }

}


//-------------------------------------------------------------------

class Comparator4 implements Comparator<Comparator2>{
@Override
public int compare(Comparator2 o1, Comparator2 o2) {
	// TODO Auto-generated method stub
	return o1.age-o2.age;
}
}

//----------------------------------------------------------------------
class Comparator3 implements Comparator<Comparator2>
{

	@Override
	public int compare(Comparator2 o1, Comparator2 o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}
	
}




