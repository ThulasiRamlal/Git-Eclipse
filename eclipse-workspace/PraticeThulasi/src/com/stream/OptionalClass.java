package com.stream;
import java.util.*;

public class OptionalClass {
	public static void main(String[] args) {
		String[] teja=new String[5];
		teja[0]="ramlal";
		teja[1]="thulasi";
		//System.out.println(teja[2].toUpperCase());
	Optional<String>teja2=Optional.ofNullable(teja[1]);
	if(teja2.isPresent())
	{
		System.out.println("upper case: "+teja[1].toUpperCase());
	}
	else
	{
		System.out.println("value is not existed");
	}
	}

}
