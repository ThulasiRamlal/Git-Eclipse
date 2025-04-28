package Oops;

import java.util.Scanner;

class Vowel
{
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		char c=scan.next().charAt(0);
		
		if((c>='a' && c<='z')||(c>='A' && c<='Z'))
		{
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='i'||c=='O'||c=='U')
			{
				System.out.println(c+" is a vowel");
				
			}
			else
			{
				System.out.println(c+" is consonant");
			}
		}
		else
		{
			System.out.println(c+" is a invalid charcter");
		}
	
	}
	
	

}