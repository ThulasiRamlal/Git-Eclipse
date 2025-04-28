package com.optionalClass;
import java.util.Optional;

public class OptionalClass5 {
	public static void main(String[] args) {
		String [] a=new String[5];
		a[0]="teja";
		a[1]="ramlal";
	//	System.out.println(a[1]);
		//System.out.println(a[2].length());
        Optional<String>teja=Optional.ofNullable(a[1]);
        if(teja.isPresent())
        {
        	System.out.println("value is executed :"+teja.get()+teja.get().toUpperCase());
        }
        else
        {
        	System.out.println("value is doenot exuted");
        }
	}

}
