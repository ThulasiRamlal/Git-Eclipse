package com.fileHandling;

import java.io.FileReader;
import java.io.FileWriter;

public class FileHandling2 {
	public static void main(String[] args) {
		try
		{
		String path1="C:\\Users\\Admin\\Desktop\\FILEHOLDER\\input1.txt";
		String path2="C:\\Users\\Admin\\Desktop\\FILEHOLDER\\output1.txt";
		FileReader fr=new FileReader(path1);
		FileWriter fw=new FileWriter(path2);
		
		int x;
		while((x=fr.read())!=-1)
		{
			fw.write(x);
		}
		fw.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
