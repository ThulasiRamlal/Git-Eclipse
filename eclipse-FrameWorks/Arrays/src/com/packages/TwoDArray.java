package com.packages;
import java.util.Scanner;
public class TwoDArray {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the lengths of the arrays");
	int arr[][][]=new int[scan.nextInt()][scan.nextInt()][scan.nextInt()];
	System.out.println("Enter the data ");
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr[i].length-1;j++) {
			for (int k=0;k<=arr[i][j].length-1;k++)
			{
			arr[i][j][k]=scan.nextInt();
			}
		}
	}
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr[i].length-1;j++) {
			for(int k=0;k<=arr[i][j].length-1;k++)
			{
			System.out.print(arr[i][j][k]+" ");
			}
		}
		System.out.println();
	}
	}

}
