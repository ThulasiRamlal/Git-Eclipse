package com.LamdaExpression;

import java.util.Scanner;

public class Lamda1Imple {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Lamda1 l1=(int a,int b)->(a+b);System.out.println("Addition: "+l1.m1(scan.nextInt(),scan.nextInt()));
	
	}

}
