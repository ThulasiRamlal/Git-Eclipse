package com.arrays;

public class SingleDimension {
	public static void main(String[] args) {
		//inserting the elements many ways
		//1st way
		int[] teja=new int[5];
		teja[0]=1;
		teja[1]=2;
		teja[3]=5;
		teja[4]=0;
		
	//----------------------------------------------------------
		System.out.println("2 index element:  "+teja[2]);
		System.out.println("1 index element:  "+teja[1]);
		System.out.println("3 index element:  "+teja[3]);
		System.out.println("4 index element:  "+teja[4]);
		System.out.println("0 index element:  "+teja[0]);
		//System.out.println("----------------------------------");
		System.out.println("using FOR looppppp......");
		for(int i =0;i<teja.length;i++)
		{
			System.out.println(teja[i]);
		}
		System.out.println("using WHILE lopp.................");
		int i=0;
		while(i<teja.length)
		{
			System.out.println(teja[i]);
			i++;
		}
		
	}

}
