package com.groupingBy;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class GroupingBy9Test {
	public static void main(String[] args) {
		List<GroupingBy9>teja=new ArrayList<GroupingBy9>();
		teja.add(new GroupingBy9(1,"thulasi","pune"));
		teja.add(new GroupingBy9(2,"Ramlal","chennai"));
		teja.add(new GroupingBy9(3,"kaveri","pune"));
		teja.add(new GroupingBy9(4,"raju","bangloore"));
		teja.add(new GroupingBy9(5,"ajith","sydney"));
		teja.add(new GroupingBy9(6,"suguna","dubai"));
		
		//Map<String,List<String>>teja2=teja.stream().collect(Collectors.groupingBy(GroupingBy9::getCity));
	Map<String,List<GroupingBy9>>teja3=teja.stream().collect(Collectors.groupingBy(GroupingBy9::getCity));
	System.out.println(teja3);
	}
}
