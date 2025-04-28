package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Stream1 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
//		//1.Filter
//	List<Integer> f=Arrays.asList(1,2,3,4,5,6);
//	List<Integer> f1=f.stream().filter(a->a%2==0).collect(Collectors.toList());
//		f1.forEach(System.out::println);
//		
		//2.Filter
		
//		System.out.println("Enter 4 Numbers");
//		List<Integer> odd=Arrays.asList(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt());
//		
//		List<Integer> odd1=odd.stream().filter(c->c%2!=0).collect(Collectors.toList());
//		odd1.forEach(System.out::print);
		
		
		//3.LowerCase
//		List<String> lc=Arrays.asList("Thulasi","ramlal","kaveri");
//	List<String>lc1=lc.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
//		lc1.forEach(System.out::println);
//		
//		System.out.println("==========================================");
//	List<String>up=lc.stream().map(q->q.toUpperCase()).collect(Collectors.toList());
//	up.forEach(System.out::println);
	
//	//4.Distinct
//	List<Integer>distinct=Arrays.asList(1,2,3,4,1,2,8);
//	List<Integer>distinct1=distinct.stream().distinct().collect(Collectors.toList());
//	distinct1.forEach(System.out::println);
//	
//	//5.Sorted
//	List<Integer>sort=Arrays.asList(2,9,8,123,180434);
//	List<Integer>sort1=sort.stream().sorted().collect(Collectors.toList());
//	sort1.forEach(System.out::println);
	
//		//6.Skip()
//		List<String>skip=Arrays.asList("thulasi","ramlal","kaveri","suguna","pichaiah","suguna");
//		List<String>skip2=skip.stream().skip(2).collect(Collectors.toList());
//		skip2.forEach(System.out::println);
		
//		//7.limit()
//		List<Integer>limit=Arrays.asList(1,2,3,4,5,6,7,8);
//		List<Integer>limit2=limit.stream().limit(4).collect(Collectors.toList());
//		limit2.forEach(System.out::println);
		
//		//8.count
//		List<Integer>count=Arrays.asList(1,2,3,4,5,6,7,8);
//		Long count1=count.stream().count();
//		System.out.println(count1);
		
		
//		//9.Reduce()
//		
//		List<Integer> red=Arrays.asList(1,2,3,4,5,6);
//		Integer red2=red.stream().reduce(0, (a,b)->a+b);
//		System.out.println("Reduce Method: "+red2);
	}

}
