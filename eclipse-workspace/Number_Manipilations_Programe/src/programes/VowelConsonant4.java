
package programes;

import java.util.Scanner;

public class VowelConsonant4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Alphabet");
		char c=scan.next().charAt(0);
		methodOne(c);
			
	}
	public static void methodOne(char c)
	{
		if((c >='A' && c<='Z') || (c>='a'&&c<='z'))
		{
			if(c=='A' ||c=='E' ||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				System.out.println(c+" is Vowel");
			}
			else
			{
				System.out.println(c+ " is consonant");
			}			
		}
		else
		{
			System.out.println(c+"is invalid charcter");
		}
		
	}

}
