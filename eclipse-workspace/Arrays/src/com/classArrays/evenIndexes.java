package com.classArrays;

import java.util.Scanner;

public class evenIndexes {
	public static void main(String[] args) {
	Scanner scan =  new Scanner(System.in);
	System.out.println("eneter  num");
	int n=scan.nextInt();
	int [] teja=new int[n];
	
  for(int i=0;i<=n;i++)
  {
	  teja[i]=scan.nextInt();
  }
  
  System.out.println("fetching the data");
  for(int i=0;i<teja.length;i++)
  {
	  System.out.println(teja[i]);
  }
}
}
