package com.optionalClass;

import java.util.Optional;

public class optionalClas4 {
	public static void main(String[] args) {
		String []teja=new String[5];
		teja[0]="teja";
		teja[1]="ramlal";
	//System.out.println(teja[1].toUpperCase());
	//System.out.println(teja[2].toUpperCase());
		Optional<String>teja2=Optional.ofNullable(teja[2]);
		if(teja2.isPresent())
		{
			System.out.println(teja2.get().toUpperCase()+" value is existed");
		}
		else
		{
			System.out.println("value is not existed");
		}
		
	}

}
