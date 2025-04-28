package com.singledimensional;

public class UniqueArray {
	/*
	 * public static void main(String[] args) { int[] a=
	 * {1,1,1,22,22,33,44,55,55,55,77}; //to find unique array for(int
	 * i=0;i<a.length-1;i++) { if(a[i]!=a[i+1]) { System.out.println(a[i]); }
	 * 
	 * } System.out.println(a[a.length-1]); }
	 */
	public static void main(String[] args) {
		int [] a= {1,2,3,3,4,5,5,6,6,7};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]!=a[i+1])
				{
					System.out.println(a[i]);
					
					
				}
			}
		}
	}

}
