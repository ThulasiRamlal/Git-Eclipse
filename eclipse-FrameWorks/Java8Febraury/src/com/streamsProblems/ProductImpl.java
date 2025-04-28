package com.streamsProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductImpl {

	public static void main(String[] args) {
		
		        List<Product>products=Arrays.asList(
				new Product("Laptop", "Electronics", 1500),
			    new Product("Smartphone", "Electronics", 800),
			    new Product("Shirt", "Clothing", 30),
			    new Product("Shoes", "Clothing", 50),
			    new Product("TV", "Electronics", 1200));
		
		
	//==========================================================
		
		System.out.println("====Filter Products by Category======");
		//Write a Java Stream operation to filter the 
		//products that belong to the "Electronics" category.
		List<Product>p1=products.stream().filter(p->"Electronics".equals(p.getCategory())).collect(Collectors.toList());
	System.out.println(p1);
	
	System.out.println("===Find the Most Expensive Product===");
	//Write a Java Stream operation to find the most expensive product.
	Optional<Integer>p2=products.stream().map(s->s.getCost()).max(Comparator.naturalOrder());
	p2.ifPresent(s->System.out.println(s));
	
	System.out.println("===Sort Products by Price in Ascending Order===");
	//Write a Java Stream operation to sort the products 
	//by their price in ascending order.
	List<Product>p3=products.stream().sorted(Comparator.comparingInt(s->s.getCost())).collect(Collectors.toList());
	System.out.println(p3);
	
	System.out.println("==== Group Products by Category====");
	//Write a Java Stream operation to find all products that have 
	//a price greater than 1000.
	List<Product>p4=products.stream().filter(s->s.getCost()>1000).collect(Collectors.toList());
	System.out.println(p4);
	
	System.out.println("=======Get Product Names and Prices=========");
	//Write a Java Stream operation to concatenate the name and price of each product into a single string in
	//the format "ProductName - $Price".
	List<String>p5=products.stream().map(s->s.getName()+"-"+s.getCost()).collect(Collectors.toList());
	System.out.println(p5);
	
	System.out.println("====Calculate the Total Price of All Products====");
	//Write a Java Stream operation to calculate the total price of all products.
	Integer p6=products.stream().map(s->s.getCost()).collect(Collectors.summingInt(s->s.intValue()));
	System.out.println(p6);
	
	System.out.println("======Count Products in Each Category======");
	//Write a Java Stream operation to count the number
	//of products in each category
 Map<String,Long> p7= products.stream().collect(Collectors.groupingBy(Product::getCategory,Collectors.counting()));	
	System.out.println(p7);
	
	System.out.println("=======Find the Cheapest Product=========");
	//Write a Java Stream operation to find the cheapest product.
	Optional<String>p8=products.stream().map(s->s.getName()+"-"+s.getCost()).min(Comparator.naturalOrder());
	System.out.println(p8);
	
	
	
	
	}
}
