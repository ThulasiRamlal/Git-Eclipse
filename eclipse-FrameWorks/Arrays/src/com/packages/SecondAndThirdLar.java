package com.packages;

import java.util.Scanner;

public class SecondAndThirdLar {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		int lar=Integer.MIN_VALUE;
		int sec=Integer.MIN_VALUE;
		int thired=Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>lar) {
				sec=lar;
				lar=arr[i];
			}
			else if(arr[i]>sec&&arr[i]!=lar) {
				sec=arr[i];
			}
			else if(arr[i]>thired&&arr[i]!=sec) {
				thired=arr[i];
			}
		}
		System.out.println(sec);
		System.out.println(thired);

	}

}
