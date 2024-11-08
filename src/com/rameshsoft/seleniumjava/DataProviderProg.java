package com.rameshsoft.seleniumjava;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderProg {
	
	@Test(dataProvider = "hardworkData")
	public void hardwork(String practHrs , String res) {
		System.out.println(practHrs + " = " + res);
	}
	
	@DataProvider
	public Object[][] hardworkData()
	{
		Object[][] obj = new Object[6][2];
		obj[0][0] = "9";
		obj[0][1] = "JOB";
		obj[1][0] = "6";
		obj[1][1] = "Practice";
		return obj;
	}
}
