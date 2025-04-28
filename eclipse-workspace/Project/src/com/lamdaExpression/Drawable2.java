package com.lamdaExpression;

public class Drawable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width=10;
		
		Drawable teja =() -> {
			System.out.println("Drawing sheet is "+width);
		};teja.draw();
	}

}
