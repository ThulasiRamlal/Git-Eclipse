package com.collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;
public class GroupBy2test {
	public static void main(String[] args) {
		List<GroupBy2>teja=new ArrayList<GroupBy2>();
		teja.add(new GroupBy2(1,"thulasi","pune"));
		teja.add(new GroupBy2(2,"ramlal","chennai"));
		teja.add(new GroupBy2(3,"teja","chennai"));
		teja.add(new GroupBy2(4,"kaveri","delhi"));
		teja.add(new GroupBy2(5,"raju","pune"));
		teja.add(new GroupBy2(1,"thulasiiiiiii","pune"));
		//Map<String, List<GroupBy2>>teja2=teja.stream().collect(Collectors.groupingBy(GroupBy2::getCity))
	Map<String,List<GroupBy2>>teja3=teja.stream().collect(Collectors.groupingBy(GroupBy2::getCity));
	System.out.println(teja3);
	}

}
