package com.collections;

public class Arrays {

	public static void main(String[] args) {
		//Single dimensional array
		//-->> single dimension array means it's collections consits of similiar data values.
		//it's fixed length and maximum capacity is 10
		int value[]=new int[12];
		value[0]=1;
		value[1]=2;
		value[2]=3;
		value[3]=4;
		value[4]=5;
		value[5]=5;
		value[6]=5;
		value[7]=5;
		value[8]=5;
		value[9]=5;
		value[10]=5;
		value[11]=6;
		for(int i=0;i<value.length ;i++)
		{
			System.out.println(value[i]);	
		}
	
}
}
