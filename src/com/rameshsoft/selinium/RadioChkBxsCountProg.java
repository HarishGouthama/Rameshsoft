package com.rameshsoft.selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioChkBxsCountProg {
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
				List<WebElement> elements = driver.findElements(By.xpath("//*"));
				System.out.println("No of frames are : " + elements.size());
				
				int radioCount = 0;
				int chkBxCount = 0;
				
				for(WebElement webElement : elements)
				{
					String str = webElement.getAttribute("type");
					if(str!=null)
					{
						if(str.equalsIgnoreCase("radio"))
						{
							radioCount++;
						}
						else if(str.equalsIgnoreCase("checkbox"))
						{
							chkBxCount++ ;
						}
					}
				}
				
				System.out.println("Radio buttons count is : "+ radioCount);
				System.out.println("Check boxes Count is :" + chkBxCount++);
				
				driver.close();
				
	}
}
