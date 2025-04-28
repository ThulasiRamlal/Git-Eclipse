package com.stream;

public class GroupingBy {
int empId;
String empName;
String empLocation;
double empSalary;

public GroupingBy(int empId,String empName,String empLocation,double empSalary)
{
	this.empId=empId;
	this.empName=empName;
	this.empLocation=empLocation;
	this.empSalary=empSalary;
}

public int getEmpId()
{
	return empId;
}
public String getEmpName()
{
	return empName;
}
public String getEmpLocation()
{
	return empLocation;
}
public double getEmpsalary()
{
	return empSalary;
}

@Override
public String toString() {
	return "GroupingBy [empId=" + empId + ", empName=" + empName + ", empLocation=" + empLocation + ", empSalary="
			+ empSalary + "]";
}

}
