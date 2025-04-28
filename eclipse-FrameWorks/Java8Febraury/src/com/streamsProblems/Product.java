package com.streamsProblems;

public class Product {
	String name;
	String category;
	int cost;
	
	public Product(String name,String category,int cost)
	{
		this.name=name;
		this.category=category;
		this.cost=cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", category=" + category + ", cost=" + cost + "]";
	}
	
}

