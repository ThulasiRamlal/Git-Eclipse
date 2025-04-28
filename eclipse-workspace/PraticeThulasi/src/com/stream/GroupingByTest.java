package com.stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Map;

public class GroupingByTest {
	public static void main(String[]args)
	{
		List<GroupingBy>teja=new ArrayList<GroupingBy>();
		teja.add(new GroupingBy(1,"ramlal","pune",2000));
		teja.add(new GroupingBy(2,"thulasi","chennai",40000));
		teja.add(new GroupingBy(3,"teja","pune",21000));
		teja.add(new GroupingBy(4,"kaveri","chennai",20202));
		teja.add(new GroupingBy(5,"Suguna","delhi",20211111));
		Map<String,List<GroupingBy>>teja2=teja.stream().collect(Collectors.groupingBy(GroupingBy::getEmpLocation));
	System.out.println(teja2);
	}

}
