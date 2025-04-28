package Oops1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PredicateApp1<I> {
	public static void main(String[] args) {
	List<Integer> teja=Arrays.asList(10,9,8,7,6,5,4,3,2,1);
	teja.stream().filter(t->t%4==0).forEach(i->System.out.println(i));
	}
	

}
