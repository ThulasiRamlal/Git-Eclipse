package com.fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandling {
	public static void main(String[] args) {
		try
		{
		
		String path1="C:\\Users\\Admin\\Desktop\\FILEHOLDER\\input.txt";
		String path2="C:\\Users\\Admin\\Desktop\\FILEHOLDER\\output.txt";
		
		FileInputStream fis=new FileInputStream(path1);
		FileOutputStream fos=new FileOutputStream(path2);
		int x;
		while((x=fis.read())!=-1)
		{
			fos.write(x);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
