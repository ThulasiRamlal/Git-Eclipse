package com.strings;

public class CompareToMethod {
	public static void main(String[] args) {
		String s1="a";
		String s2="b";
		int res=s2.compareTo(s1);
		if(res>0)
		{
			System.out.println("String 1 is GREATER");
		}
		else if(res<0)
		{
			System.out.println("String 2 is SMALLER");
		}
		else
		{
			System.out.println("Both string are equal");
		}
		
		System.out.println("==============Trim method============");
		String s3=" thulasi ";
		System.out.println(s3.length());
	String s4=s3.trim();
		System.out.println(s4);
		System.out.println(s4.length());
		System.out.println("=============Split method=============");
	String s5="Kodnest technologies Pvt ltd";
	String [] s6=s5.split("n");
	for(String i:s6)
	{
		System.out.println(i+" ");
	}
	}

}
