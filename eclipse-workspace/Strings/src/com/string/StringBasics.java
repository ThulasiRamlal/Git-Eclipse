package com.string;

public class StringBasics {
	public static void main(String[] args) {
		
		String s = "Ramlal";
		String s1 = "Ramlal";
		String s2 ="Thulasi";
		String s4 = "Teja";
		String s5="ramlal";
		String s6= new String("Ramlal");
		String s7=new String("Ramlal");
		String s8 =new String ("Thulasi");
		String s9=new String("Teja");
		String s10=new String("teja");
		
		
		//equals() method	
//comparing in string literal and string literal by using  Equals method
		
		System.out.println(s.equals(s1)); //true
		System.out.println(s.equals(s5)); //false
		System.out.println(s2.equals(s1)); //false
		System.out.println(s.equals(s1)); //true
		System.out.println("----------------------------");
		
//comparing in Strings and Strings by using Equals method
		
		System.out.println(s6.equals(s7)); //true
		System.out.println(s6.equals(s6)); //true
		System.out.println(s6.equals(s8)); //false
		System.out.println(s9.equals(s10)); //false
		System.out.println("------------------------------");
		
//comparing in String literals And Strings by using Equals method
		
		System.out.println(s.equals(s6)); //true
		System.out.println(s.equals(s8)); //false
		System.out.println(s4.equals(s10)); //false
		System.out.println("-----------------------------");
		
		//Reference Comparision(==) (or) double equal operator
		
//comparing in string literal and string literal by using  Equals(==) operator
		
		System.out.println(s==s1); //true
		System.out.println(s2==s4); //false
		System.out.println(s1==s1); //;true
		System.out.println(s2==s5); //false
		System.out.println("----------------------------");
		
//comparing in Strings and Strings by using Equals method	
		System.out.println(s6==s6); //true
		System.out.println(s6==s7); //false 
		System.out.println(s6==s8); //false
		System.out.println("-------------------------------");
		
//comparing in String literals And Strings by using Equals method
		System.out.println(s1==s6); //false
		System.out.println(s==s10); //false
		System.out.println(s2==s9); //false
		

		}

}
