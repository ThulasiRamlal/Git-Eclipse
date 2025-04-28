package com.fileHandling;

import java.io.File;

public class FileHandling5 {
	public static void main(String[] args) {
		String path1="C:\\Users\\Admin\\Desktop\\FILEHOLDER\\input3.txt";
		try
		{
			
		
		File f=new File(path1);
		System.out.println(f.exists());
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getCanonicalPath());
		System.out.println(f.getPath());
		System.out.println(f.getParent());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
	}
		
	catch(Exception e)
	{
		e.printStackTrace();
	}

}
}
