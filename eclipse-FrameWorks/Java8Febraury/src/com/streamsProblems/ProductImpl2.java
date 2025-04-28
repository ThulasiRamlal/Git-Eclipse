package com.streamsProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductImpl2 {
	public static void main(String[] args) {
        List<Product>products=Arrays.asList(
		new Product("Laptop", "Electronics", 1500),
	    new Product("Smartphone", "Electronics", 800),
	    new Product("Shirt", "Clothing", 30),
	    new Product("Shoes", "Clothing", 50),
	    new Product("TV", "Electronics", 1200));
        
		
        System.out.println("=====Filter products by category \"Electronics\"========");
        //Write a Stream operation to get all products in the "Electronics" category.
		List<Product>p1=products.stream().filter(s->s.getCategory().equals("Electronics")).collect(Collectors.toList());
		System.out.println(p1);
		System.out.println("==========Filter products by price greater than $100"
				+ "=========");
		List<String>p2=products.stream().map(s->s.getName()).sorted().collect(Collectors.toList());
		System.out.println(p2);
	}

}
