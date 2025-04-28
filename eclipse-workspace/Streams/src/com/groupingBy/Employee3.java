package com.groupingBy;

public class Employee3 {
  int empID;
  String empName;
  double empSalary;
  String empLocation;
  
  public Employee3(int empID,String empName,double empSalary,String empLocation)
  {
	  this.empID=empID;
	  this.empName=empName;
	  this.empSalary=empSalary;
	  this.empLocation=empLocation;
  }
  public int getEmpId()
  {
	  return empID;
  }
  public String getEmpName()
  {
	  return empName;
  }
  public double getEmpSalary()
  {
	  return empSalary;
  }
  public String getEmpLocation()
  {
	  return empLocation;
  }
@Override
public String toString() {
	return "Employee3 [empID=" + empID + ", empName=" + empName + ", empSalary=" + empSalary + ", empLocation="
			+ empLocation + "]";
}
  

}
