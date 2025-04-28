package com.arrays;
import java.util.Scanner;
public class EmployeeTest {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter number of Employee to create");
		int size=scan.nextInt();
		Employee[] emp=new Employee[size];
		System.out.println("enter a name ,age and salary");
		for(int i=0;i<=emp.length-1;i++)
		{
			System.out.println(i+"st data");
		String name=scan.next();
		int age=scan.nextInt();
		int salary=scan.nextInt();
		Employee employee=new Employee(name,age,salary);
		emp[i]=employee;
		}
		for(int i=0;i<=emp.length-1;i++)
		{
			System.out.println(emp[i].name+" : "+emp[i].age+" : "+emp[i].salary);
		}
	}

}
