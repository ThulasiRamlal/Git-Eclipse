package com.arrays;

public class MultidimensionalArray2 {
	public static void main(String[] args) {
		//to find how many elements (or) size contains in array
		int[][]arr=new int[][] {{1,2,3},{1,2,3},{1,2,3}};
		int size=0;
		for(int i=0;i<arr.length;i++)
		{
			size=size+arr[i].length;
		}
		System.out.println(size);
	}

}
