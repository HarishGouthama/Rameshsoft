package com.rameshsoft.seleniumjava;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersProg {
	
	@Parameters({"practHrs","res"})
	@Test(invocationCount = 5)
	public void hardwork(@Optional("6")String practHrs , @Optional("jobsss")String res) {
		System.out.println("Practice = Job: " + practHrs + " = " + res);
	}
	
	
}
