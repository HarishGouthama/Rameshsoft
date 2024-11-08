package com.rameshsoft.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdpCountProg {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		//SearchContext sc = new ChromeDriver();   //Not recommanded in real time
		//RemoteWebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.adp.com/");
		
		//List<WebElement> elements = driver.findElements(By.xpath("//*"));
		List<WebElement> elements = driver.findElements(By.cssSelector("*"));
		System.out.println("No of elements are : " + elements.size());
		
		int adpCount = 0;
		
		Iterator<WebElement> itr = elements.iterator();
		
		while(itr.hasNext())
		{
			WebElement webElement = itr.next();
			String txt = webElement.getText();
			if(txt!=null)
			{
				if(txt.contains("adp") || txt.contains("ADP"))
				{
					adpCount++;
				}
			}
		}
		
		System.out.println("Adp count is :" + adpCount);
		
		driver.close();
		
	}
}
