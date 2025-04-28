package com.collection4;

import java.util.ArrayList;

import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayList1 {
	public static void main(String[] args) {
	List<Integer>teja=new ArrayList<Integer>();
    teja.add(12);
    teja.add(22);
    teja.add(24);
    teja.add(16);
    System.out.println(teja);
    List<Integer>teja1=new ArrayList<Integer>();
    teja1.add(100);
    teja1.add(200);
    teja.addAll(teja1);
    System.out.println(teja);
    System.out.println("==================================");
    Iterator<Integer>teja2=teja.iterator();
    {
    	while(teja2.hasNext())
    	{
    		System.out.println(teja2.next());
    	}
    }
    System.out.println("=======================================");
    ListIterator<Integer>teja3=teja.listIterator();
    		{
    			while(teja3.hasNext())
    			{
    				System.out.println(teja3.next());
    			}
    	
    		}
    		System.out.println("===================================");
    		ListIterator<Integer>teja4=teja.listIterator();
    		{
    			while(teja4.hasPrevious())
    			{
    				System.out.println(teja4.previous());
    			}
    		}
	}

}
