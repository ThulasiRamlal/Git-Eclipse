package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Practice2 {
	public static void main(String[] args) {
		
		System.out.println("===== Count Occurrences of Each Element===========");
		List<Integer> n = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
		Map<Integer,Long>n1=n.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
		System.out.println(n1);
		System.out.println("=======Concatenate Strings==========");
		List<String>w = Arrays.asList("Java", "Streams", "are", "powerful");
		String w1=w.stream().collect(Collectors.joining(" ", "[", "]"));
		System.out.println(w1);
		System.out.println("========Skip Example============");
		List<Integer> skip = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		List<Integer>skip1=skip.stream().skip(skip.size()-3).collect(Collectors.toList());
		System.out.println(skip1);
		
		System.out.println("========= FlatMap with Different Types============");
		//Given a list of lists of integers and strings, flatten it into a single list of strings.
		List<List<?>>lol=Arrays.asList(Arrays.asList(1,2,3),
				Arrays.asList("a","b","c"),Arrays.asList(4,5,6));
		String lol1=lol.stream().flatMap(s->s.stream().map(String::valueOf))
				.collect(Collectors.joining(" ,", "[", "]"));
	System.out.println(lol1);
	
	System.out.println("======Filter Strings by Length==========");
	//Given a list of strings, filter out all strings that are shorter than 5 characters.
	List<String> words = Arrays.asList("apple", "kiwi", "banana", "grape");
	List<String>words2=words.stream().filter(s->s.length()>5).collect(Collectors.toList());
	System.out.println(words2);
	
	System.out.println("=======Map and Filter Combined==========");
	//Given a list of integers, square the numbers greater than 10 and filter out those less than 50.
	List<Integer> a = Arrays.asList(5, 12, 3, 18, 9, 25);
	List<Integer>a1=a.stream().filter(s->s>10).map(s->s*s).filter(s->s>50).collect(Collectors.toList());
	System.out.println(a1);
	
	System.out.println("=====Count Occurrences of Specific Value=========");
	//Given a list of strings, count how many times the word "apple" appears.
	List<String> fruits = Arrays.asList("apple", "banana", "apple", "kiwi", "apple");
   Long fruits1=fruits.stream().filter(s->s.equals("apple")).collect(Collectors.counting());
	System.out.println(fruits1);
	
	System.out.println(" =====Find Minimum Value in a List====");
	//Given a list of integers, find the smallest number in the list using streams.
	List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
	Optional<Integer> numbers2=numbers.stream().min(Comparator.naturalOrder());
		System.out.println(numbers2);	
	//numbers2.ifPresent(s->System.out.println(numbers2));
	
	System.out.println("=== Find First Occurrence of a Condition====");	
//Given a list of integers, find the first even number greater than 10 using streams.
	List<Integer> e = Arrays.asList(9, 15, 12, 7, 22, 5);	
	List<Integer>e1=e.stream().filter(s->s%2==0).filter(s->s>20).collect(Collectors.toList());
	System.out.println(e1);
	
	System.out.println("=====Create a List of Square Roots=======");
	//Given a list of integers, create a list of their square roots.
	List<Integer> sr = Arrays.asList(1, 4, 9, 16, 25);
	//===========================================
	System.out.println("==Concatenate Strings with a Specific Separator=====");
	//Given a list of strings, concatenate them into a single string, separated by a hyphen (-).
	List<String> s = Arrays.asList("apple", "banana", "cherry");
	String s1=s.stream().collect(Collectors.joining("-", "['", "']"));
	System.out.println(s1);
	
	System.out.println("===Partition List Based on Condition====");
	//Given a list of integers, partition it into two lists: 
	//one with numbers greater than 10 and one with
	//numbers less than or equal to 10.
	List<Integer> p = Arrays.asList(5, 15, 12, 3, 20, 7);
	Map<Boolean, List<Integer>>p1=p.stream().collect(Collectors.partitioningBy(t->t>10));
	System.out.println(p1);
	
	System.out.println("======Convert a List of Strings to Uppercase=====");
	//Given a list of strings, convert all strings to uppercase and return 
			//the result as a new list.
	List<String> uppercase = Arrays.asList("apple", "banana", "cherry");
	List<String>uppercase2=uppercase.stream().map(b->b.toUpperCase()).collect(Collectors.toList());
	//uppercase2.forEach(System.out::println);
	System.out.println(uppercase2);
	
	}

}
