package com.stream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Map;
public class GroupingBy6Test {
	public static void main(String[] args) {
		List<GroupingBY6>teja=new ArrayList<GroupingBY6>();
		teja.add(new GroupingBY6("Thulasi","pune"));
		teja.add(new GroupingBY6("ramlal","chennai"));
		teja.add(new GroupingBY6("Teja","mumbai"));
		teja.add(new GroupingBY6("ajith","pune"));
		teja.add(new GroupingBY6("raju","chennai"));
		teja.add(new GroupingBY6("sreekanth","pune"));
		teja.add(new GroupingBY6("suguna","dehli"));
		teja.add(new GroupingBY6("pichaiah","noida"));
		Map<String,List<GroupingBY6>>teja2=teja.stream().collect(Collectors.groupingBy(GroupingBY6::getLocation));
	System.out.println(teja2);
	System.out.println("==============================");
	
	}

}
