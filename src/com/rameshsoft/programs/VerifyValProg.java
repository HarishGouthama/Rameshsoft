package com.rameshsoft.programs;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class VerifyValProg {
	public static void main(String[] args) {
		
		int num1 = 25 , num2 = 95;
		
		System.out.println("1");
		System.out.println("2");
		//SoftAssert assert1 = new SoftAssert();
		//assert1.assertEquals(num1 ,  num2);
		//Assert.assertEquals(num1, num2);
		Assert.assertTrue(num1<=num2);
		//Assert.asserTh
		System.out.println("3");
		System.out.println("4");
		
		
		
		
		
		
		
		
		
		
		
		/*if(num1>=num2) {
			System.out.println("Hello");
		}
		else
		{
			System.out.println("HI");
		}	*/
		
	}
}
