package com.fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileHandling3 {
	public static void main(String[] args) {
		try
		{
		String path1="C:\\Users\\Admin\\Desktop\\FILEHOLDER\\input2.txt";
		String path2="C:\\Users\\Admin\\Desktop\\FILEHOLDER\\output2.txt";
		
		FileReader fr=new FileReader(path1);
		FileWriter fw=new FileWriter(path2);
		
		BufferedReader br=new BufferedReader(fr);
		BufferedWriter bw=new BufferedWriter(fw);
		String x;
		while((x=br.readLine())!=null)
		{
			bw.write(x);
		}
		bw.flush();
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
