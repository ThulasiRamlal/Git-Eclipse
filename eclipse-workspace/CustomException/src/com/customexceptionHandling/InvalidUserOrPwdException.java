package com.customexceptionHandling;

public class InvalidUserOrPwdException extends Exception {

	@Override
	public String getMessage() {
		
		return "YOU ENTERED WRONG USER ID AND PASSWORD";
	}
	

}
