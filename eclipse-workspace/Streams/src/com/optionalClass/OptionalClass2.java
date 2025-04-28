package com.optionalClass;

import java.util.Optional;

public class OptionalClass2 {
	public static void main(String[] args) {
		
		String [] a=new String[5];
		a[0]="Thulasi";
		a[1]="Ram";
		//System.out.println(a[2].toUpperCase());
		Optional<String>teja2=Optional.ofNullable(a[1]);
		if(teja2.isPresent())
		{
			System.out.println("these value is excuted: "+teja2.get().toUpperCase());
		}
		else
		{
		System.out.println("Value is not exited");
		}
		
		System.out.println(teja2);
	}

}
