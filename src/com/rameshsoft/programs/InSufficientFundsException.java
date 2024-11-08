package com.rameshsoft.programs;

public class InSufficientFundsException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1337004681048744851L;

	public InSufficientFundsException()
	{
		super();		
	}
	
	public InSufficientFundsException(String exceptionMsg)
	{
		super(exceptionMsg);
	}
}
