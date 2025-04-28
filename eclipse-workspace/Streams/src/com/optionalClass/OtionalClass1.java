package com.optionalClass;

import java.util.Optional;

public class OtionalClass1 {
	public static void main(String[] args) {
	String[] teja=new String[5];
	teja[0]="thulasi";
	teja[1]="kaveri";
	//System.out.println(teja[2].toUpperCase());
	//System.out.println(teja[1]);
	//System.out.println(teja[2].toUpperCase());
	//Optinal class
	//Optional<String>teja2=Optional.empty();
	//System.out.println(teja2);
	Optional<String>teja3=Optional.ofNullable(teja[2]);
	if(teja3.isPresent())
	{
		System.out.println("Value existed.."+teja3.get().toUpperCase());
	}
	else
	{
		System.out.println("value is not existed");
	}
	
	}
}
