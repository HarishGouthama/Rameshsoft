package com.rameshsoft.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperationsProg {
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuleSoft\\OneDrive\\Desktop\\New folder\\RameshSoft\\src\\Drivers\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		//SearchContext sc = new ChromeDriver();   //Not recommanded in real time
		//RemoteWebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		
		WebElement newAcc = driver.findElement(By.xpath("//a[text() = 'Create new account']"));
		if(newAcc.isDisplayed()&&newAcc.isEnabled())
		{
			newAcc.click();
		}
		else
		{
			System.out.println("NewAcc is not displayed");
		}
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		if(firstName.isDisplayed() && firstName.isEnabled())
		{
			firstName.clear();
			firstName.sendKeys("harish1992.it@gmail.com");
		}
		else
		{
			System.out.println("firstName is not displayed");
		}	
		
		WebElement radioBtn =  driver.findElement(By.xpath("//input[@id='u_3_k_f5"));
		
		if(radioBtn.isDisplayed() && radioBtn.isEnabled())
		{
			radioBtn.click();
		}
		else
		{
			System.out.println("Radio button is not displayed");
		}	
		
		
		if(radioBtn.isSelected())
		{
			System.out.println("Radio button is selected");
		}
		else
		{
			System.out.println("Radio button is not selected");
		}
		
	}
}
