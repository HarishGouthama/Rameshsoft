package com.rameshsoft.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksProg {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		//SearchContext sc = new ChromeDriver();   //Not recommanded in real time
		//RemoteWebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.adp.com/");
		
		
		List<WebElement> elements = driver.findElements(By.xpath("//*"));
		System.out.println("No of elements are : " + elements.size());
		
		int enabledLink = 0;
		int disLink = 0;
		
		for(WebElement webElement : elements)
		{
			String tagName = webElement.getTagName();
			if(tagName.equalsIgnoreCase("a"))
			{
				if(webElement.isDisplayed()&&webElement.isEnabled())
				{
					enabledLink++;
				}
				else
				{
					disLink++;
				}
			}
		}
		
		System.out.println("Enabled Links are :  " + enabledLink);
		System.out.println("Disabled links are : " + disLink);
		
		driver.close();
		
	}
}
