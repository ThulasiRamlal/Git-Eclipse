package com.concurentcollection;
import java.util.*;

public class ConcurrentClassEx {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		for(int i=0; i<=a.size()-1;i++)
		{
			System.out.print(a.get(i)+" ");
		}
		System.out.println();
		System.out.println("==========LINKED LIST=========");
		//====================================
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(40);
		l.add(50);
		l.addAll(a);
		for(int i=0;i<l.size();i++)
		{
			System.out.print(l.get(i)+" ");
		}
		//===========================================
		System.out.println("=============SET===============");
	
		
		
		
	}

}
