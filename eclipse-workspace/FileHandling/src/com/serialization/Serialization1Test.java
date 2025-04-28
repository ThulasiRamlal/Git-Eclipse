package com.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization1Test {
	public static void main(String[] args) {
		try
		{
		Serialization1 s=new Serialization1("Thulasi", 21, "male", 95);
		System.out.println(s);
		System.out.println("Go to file and check ");
		String path1="C:\\Users\\Admin\\Desktop\\FILEHOLDER\\serialization\\input1.txt";
		FileOutputStream fos=new FileOutputStream(path1);
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		oos.writeObject(s);
		System.out.println("Serilaized completed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
