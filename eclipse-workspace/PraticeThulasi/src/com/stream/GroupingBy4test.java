package com.stream;
import java.util.Map;
import java.util.*;
import java.util.stream.*;

public class GroupingBy4test {
	public static void main(String[]args)
	{
	List<GroupingBy4>teja=new ArrayList<GroupingBy4>();
	teja.add(new GroupingBy4(1,"thulasi","pune"));
	teja.add(new GroupingBy4(2,"teja","chennai"));
	teja.add(new GroupingBy4(3,"Sreekanth","pune"));
	teja.add(new GroupingBy4(4,"ajith","tirupati"));
	teja.add(new GroupingBy4(5,"raju","delhi"));
	Map<String,List<GroupingBy4>>teja2=teja.stream().collect(Collectors.groupingBy(GroupingBy4::getLocation));
	System.out.println(teja2);
	}


}
