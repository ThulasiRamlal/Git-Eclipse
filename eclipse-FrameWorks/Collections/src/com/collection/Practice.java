package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {
	public static void main(String[] args) {
		

        // Creating an integer Arraylist to store marks
        ArrayList<Integer> marks = new ArrayList<Integer>();

        // These are marks of the students
        // Considering 5 students so input entries
        marks.add(30);
        marks.add(78);
        marks.add(26);
        marks.add(96);
        marks.add(79);
        
   List<Integer>marks2=marks.stream().collect(Collectors.toList());
	marks2.forEach(System.out::println);
	System.out.println("===================");
	List<Integer>marks3=marks.stream().map(i->(i*2)).collect(Collectors.toList());
		marks3.forEach(System.out::println);
	}

}
