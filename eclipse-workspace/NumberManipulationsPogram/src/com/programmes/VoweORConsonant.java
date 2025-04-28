package com.programmes;
import java.util.Scanner;

public class VoweORConsonant {
	public static void main(String[] args) {
		VoweORConsonant teja= new VoweORConsonant();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Vowel");
		char a=scan.next().charAt(0);
		teja.display(a);
		//(c >='A' && c<='Z') || (c>='a'&&c<='z')
	}
	public void display(char a)
	{
		if((a>='a'&&a<='z')||(a>='A'&& a<='Z'))
		{
			if(a=='a'||a=='i'||a=='e'||a=='o'||a=='u'||a=='A'||a=='I'||a=='E'||a=='O'||a=='U')
			{
				System.out.println(a+" : is a vowel");
			}
			else
			{
				System.out.println(a+" : is a consonant");
			}
			
		}
		else
		{
			System.out.println(a+" :is not alphabet");
		}
	}

}
