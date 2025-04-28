package com.customexception;

public class OverAgeException extends Exception {
	//@Overidden
	public String getMessgae()
	{
		return "You are not eligible for married because in Over age";
	}

}
