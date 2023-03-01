package com.jsp.medicworld.exception;

public class ResourceNotFound extends RuntimeException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String usernamefound(int usermail)
	{
		return "This is" +usermail+ "is already found";
	}
}
